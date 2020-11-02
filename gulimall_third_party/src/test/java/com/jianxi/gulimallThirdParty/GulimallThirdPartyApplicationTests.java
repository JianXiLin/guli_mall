package com.jianxi.gulimallThirdParty;


import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class GulimallThirdPartyApplicationTests {

	@Autowired
    OSSClient ossClient;
	//
	//@Test
	//public void testUpload() throws FileNotFoundException {
	//	// Endpoint以杭州为例，其它Region请按实际情况填写。
	//	String endpoint = "oss-cn-beijing.aliyuncs.com";
	//	// 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
	//	String accessKeyId = "LTAI4GAuvwz88Ad64LuYHfyX";
	//	String accessKeySecret = "j2X4S2UTDuSTVxkBYntoCRN9swBiiV";
	//
	//	// 创建OSSClient实例。
	//	OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
	//
	//	// 上传文件流。
	//	InputStream inputStream = new FileInputStream("/home/jianxi/Pictures/壁纸/v2-a7cc59104bfe8761c8706a369a37691a_r.jpg");
	//	ossClient.putObject("gulimall-jianxi", "java-oss-img", inputStream);
	//
	//	// 关闭OSSClient。
	//	ossClient.shutdown();
	//}
	//
	@Test
	public void testUpload_springcloud() throws FileNotFoundException {

		// 上传文件流。
		InputStream inputStream = new FileInputStream("/home/jianxi/Pictures/壁纸/v2-a7cc59104bfe8761c8706a369a37691a_r.jpg");
		ossClient.putObject("gulimall-jianxi", "java-oss-img-springcloud-third-party", inputStream);

		// 关闭OSSClient。
		ossClient.shutdown();
	}
}
