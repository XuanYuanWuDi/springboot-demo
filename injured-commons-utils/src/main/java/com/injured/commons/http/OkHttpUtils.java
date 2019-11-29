package com.injured.commons.http;

import okhttp3.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @author xxj
 *
 */
public class OkHttpUtils {

	private static final OkHttpClient client = new OkHttpClient.Builder().connectTimeout(60, TimeUnit.SECONDS).build();
	public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

	public static final String APPLICATION_FORM_URLENCODED = "application/x-www-form-urlencoded;charset=utf-8";

	public static final String APPLICATION_JSON = "application/json;charset=utf-8";

	public static final String APPLICATION_XML = "application/xml;charset=utf-8";

	public static final String MULTIPART_FORM_DATA = "multipart/form-data";

	public static final String TEXT_HTML = "text/html;charset=utf-8";

	public static final String TEXT_PLAIN = "text/plain;charset=utf-8";

	public static final String TEXT_XML = "text/xml;charset=utf-8";

	/**
	 * get请求
	 * 
	 * @param url
	 * @return byte[]
	 * @throws IOException
	 */
	public static InputStream getReturnStream(String url) throws IOException {
		// RequestBody body= RequestBody.create(JSON, json);
		Request request = new Request.Builder().url(url).get().build();
		Response response = client.newCall(request).execute();
		if (response.isSuccessful()) {
			return response.body().byteStream();
		} else {
			throw new IOException("Unexpected code " + response);
		}
	}

	/**
	 * post请求
	 * 
	 * @param url
	 * @param json
	 * @return byte[]
	 * @throws IOException
	 */
	public static byte[] postReturnByte(String url, String json) throws IOException {
		RequestBody body = RequestBody.create(JSON, json);
		Request request = new Request.Builder().url(url).post(body).build();
		Response response = client.newCall(request).execute();
		if (response.isSuccessful()) {
			return response.body().bytes();
		} else {
			throw new IOException("Unexpected code " + response);
		}
	}

	/**
	 * get请求
	 * 
	 * @param url
	 * @return String
	 * @throws IOException
	 */
	public static String get(String url) throws IOException {
		// RequestBody body= RequestBody.create(JSON, json);
		Request request = new Request.Builder().url(url).get().build();
		Response response = client.newCall(request).execute();
		if (response.isSuccessful()) {
			return response.body().string();
		} else {
			throw new IOException("Unexpected code " + response);
		}
	}

	/**
	 * 参数类型为json的post请求
	 * 
	 * @param url
	 * @param json
	 * @return
	 * @throws IOException
	 */
	public static String post(String url, String json) throws IOException {
		RequestBody body = RequestBody.create(JSON, json);
		Request request = new Request.Builder().url(url).post(body).build();
		Response response = client.newCall(request).execute();
		if (response.isSuccessful()) {
			return response.body().string();
		} else {
			throw new IOException("Unexpected code " + response);
		}
	}


	public static String postOtherMediaType(String url, String data, MediaType mediaType) throws IOException  {
		RequestBody body = RequestBody.create(mediaType, data);
		Request request = new Request.Builder().url(url).post(body).build();
		Response response = client.newCall(request).execute();
		if (response.isSuccessful()) {
			return response.body().string();
		} else {
			throw new IOException("Unexpected code " + response);
		}
	}

	/**
	 * 无参数发送post请求
	 * 
	 * @param url
	 * @return
	 * @throws IOException
	 */
	public static String postTest(String url) throws IOException {
		return post(url, "{}");
	}


	/**
	 * 参数类型为json的post请求,添加headers
	 *
	 * @param url
	 * @param json
	 * @return
	 * @throws IOException
	 */
	public static String postAddHeaders(String url, String json, List<Map<String,String>> headers) throws IOException {
		RequestBody body = RequestBody.create(JSON, json);
		Request.Builder builder = new Request.Builder().url(url).post(body);

		if(!headers.isEmpty() && headers.size() > 0){
			headers.stream().forEach(map -> map.entrySet().forEach(e -> builder.addHeader(e.getKey(),e.getValue())));
		}
		Request request = builder.build();

		Response response = client.newCall(request).execute();
		if (response.isSuccessful()) {
			return response.body().string();
		} else {
			System.out.println("请求异常");
			throw new IOException("Unexpected code " + response);
		}
	}
}
