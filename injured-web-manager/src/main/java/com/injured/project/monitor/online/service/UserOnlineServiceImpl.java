package com.injured.project.monitor.online.service;

import java.util.Date;
import java.util.List;

import com.injured.project.system.user.domain.User;
import com.injured.project.system.user.service.IUserService;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.injured.common.utils.DateUtils;
import com.injured.common.utils.StringUtils;
import com.injured.framework.shiro.session.OnlineSessionDAO;
import com.injured.project.monitor.online.domain.UserOnline;
import com.injured.project.monitor.online.mapper.UserOnlineMapper;

/**
 * 在线用户 服务层处理
 * 
 * @author lzx
 */
@Service
public class UserOnlineServiceImpl implements IUserOnlineService
{
    @Autowired
    private UserOnlineMapper userOnlineDao;

    @Autowired
    private OnlineSessionDAO onlineSessionDAO;

    @Autowired
    private IUserService userService;

    /**
     * 通过会话序号查询信息
     * 
     * @param sessionId 会话ID
     * @return 在线用户信息
     */
    @Override
    public UserOnline selectOnlineById(String sessionId)
    {
        return userOnlineDao.selectOnlineById(sessionId);
    }

    /**
     * 通过会话序号删除信息
     * 
     * @param sessionId 会话ID
     * @return 在线用户信息
     */
    @Override
    public void deleteOnlineById(String sessionId)
    {
        UserOnline userOnline = selectOnlineById(sessionId);
        if (StringUtils.isNotNull(userOnline))
        {
            //修改用户信息为未登录
            User user = new User();
            user.setUserId(Long.valueOf(userOnline.getDeptName()));
            user.setIsMoveIn(1);//未登录
            user.setUpdateBy(userOnline.getLoginName());
            userService.updateIsMoveInLoginOut(user);
            userOnlineDao.deleteOnlineById(sessionId);
        }
    }

    /**
     * 通过会话序号删除信息
     * 
     * @param sessions 会话ID集合
     * @return 在线用户信息
     */
    @Override
    public void batchDeleteOnline(List<String> sessions)
    {
        User user = null;
        for (String sessionId : sessions)
        {
            UserOnline userOnline = selectOnlineById(sessionId);
            if (StringUtils.isNotNull(userOnline))
            {
                //修改用户信息为未登录
                user = new User();
                if(StringUtils.isNotBlank(userOnline.getDeptName())) {
                    user.setUserId(Long.valueOf(userOnline.getDeptName()));
                }
                user.setIsMoveIn(1);
                user.setUpdateBy("session过期");
                userService.updateIsMoveInLoginOut(user);
                userOnlineDao.deleteOnlineById(sessionId);
            }
        }
    }

    /**
     * 保存会话信息
     * 
     * @param online 会话信息
     */
    @Override
    public void saveOnline(UserOnline online)
    {
        userOnlineDao.saveOnline(online);
    }

    /**
     * 查询会话集合
     * 
     * @param pageUtilEntity 分页参数
     */
    @Override
    public List<UserOnline> selectUserOnlineList(UserOnline userOnline)
    {
        return userOnlineDao.selectUserOnlineList(userOnline);
    }

    /**
     * 强退用户
     * 
     * @param sessionId 会话ID
     */
    @Override
    public void forceLogout(String sessionId)
    {
        Session session = onlineSessionDAO.readSession(sessionId);
        if (session == null)
        {
            return;
        }
        session.setTimeout(1000);
        userOnlineDao.deleteOnlineById(sessionId);
    }

    /**
     * 查询会话集合
     * 
     * @param online 会话信息
     */
    @Override
    public List<UserOnline> selectOnlineByExpired(Date expiredDate)
    {
        String lastAccessTime = DateUtils.parseDateToStr(DateUtils.YYYY_MM_DD_HH_MM_SS, expiredDate);
        return userOnlineDao.selectOnlineByExpired(lastAccessTime);
    }
}
