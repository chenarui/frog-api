package com.frog.common;

public class AlipayConfig {
	  //合作身份者ID，签约账号，以2088开头由16位纯数字组成的字符串，查看地址：https://openhome.alipay.com/platform/keyManage.htm?keyType=partner
    public static String partner = "2088721121848930";

    //商户的私钥,需要PKCS8格式，RSA公私钥生成：https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.nBDxfy&treeId=58&articleId=103242&docType=1
   public static String private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCo0EInLDyBIVoOH7CcVArTibNJwOvxQhkijv2tRdVvLS0B+WSKeHwBOksujuXGPFx5x6Tmh3kB1O4U6PNkJ/XBBnn++7n+uO1NE/GdOMigjTdhbbXz5haPqp49qYRKV2hCh/UFBsw7YzOdwAhYf9GWP+W9emVDHMKIGuBfHcdyFuzJBVSTcl+eai3qK1orgtUsU03kU6kEjmCczTEGTpXIprRIwkikH/K0dJId+1vvyI6Sx7+74InvI0M0KvTZ9oCfYKxMMXQo8yplFpGr36hNyPw9DxAQZR0IwB32nL5l8aeDqrW0fnj1PdUUvIuiotG3HTva6+en7JS+sTuZtgrzAgMBAAECggEARJEKPZT3Ik/knxX6CxULrK4id1N3we9h/CpuGQHjVhvYSxP75U5Yt7rwrIF4DJOZ0BDqBoSB/t94sF+J9GVSqUszJAEko7SDFiqCmaRlwOh61QTVwbHz+fiH+22uAPANtfA48gi3zWtWnL1R5nhMLaXYb6SWGrNExDl+ZsPWrZy+ky+4ANANTc2j9YiK++/I8Y0qtFWAHkm2oAWGvgrn13TsjL3G6QAxLvkvRxyp+wC+CbrlIcm4a8FlxxElYMTQiK0Jld51yyUf/YftdtMzo6xWmbtB7FBVv1PRrbTrTeLm/PwOTL5qUpH9G+rQGiUIOzA+i0vSPrsuJehGskUSOQKBgQDjdO5UWMfzcXOQdeXuar8uFjXkajClNG+zxa53Ld0S8Bl1JeuU0LqNSI71RGUpfQa5dI1FvLHu0nz28DI8vud0RMq8MRgKAypihjSkH92vZbU834Z6AtlA02GdJzvT56bPd5Dej54IyR+iL8M/v/+8dGysg2nvNRxJqFyJ2XoYnwKBgQC9/2hcShdWDEF8tzE/qcWTyA0UXqiS94XoK9sK3WZO5mSkjXYZ4rIwC2KHKQtkKajYvT1c78vEnXk+8PTqhROr1LzdpEm+iFoHIsVkzW1TFBrXpen0MyC5Xl8Ug/RvGNawT2RaBr06n7ubQGBYLS24if8gFcBfChQOpHCi1snpLQKBgQDeA8eRuurIm4eCjSG22qjrMjC+WExNJOaXIbBOkgzErGkc6LuPEUHWH+myS2U23tuOb85pMGq5QulJG2Dd3DUNTwxYLs9ZDofzjS2auaPnzS3fUgrv0xH97ZXNEHucNfOjdACKzMIjrzTaWSaKdj0H1Ngydz8ShtOqrdRNlWJQ3wKBgQCvJIsSUCZU5vVTPxgCBMEiKo6MEXo6CDyDOjIwQMl3wABUhCazU/tIOKZ5y8c5bQG90iyHyHFBbJyA/eP3b/cjNfdoJXLpVY4P9+iYtJmrtOPNmJ8iwiLPXgQtyDoCU5ZMbtMl/gJf0TFCu0RU5Ei6TVNGQ2bS9Vpp6QH/yhnUfQKBgCWUtkGG2IPCrfdXrbxY7FX3c910fQ2rp1EVL2xFik+FYukdGbEyZJksGOPVbc7JmcZJUiEhU8eruWN6m5WWWnb2wix/JgIc5jaFLACWISvdCANIGQ0/40u6c5N1kbkNyDpgcxTZxZAIGyIA6T98B3kSXY6kycbcmpBkCZVnqir3";

    //支付宝的公钥，查看地址：https://openhome.alipay.com/platform/keyManage.htm?keyType=partner
  public static String alipay_public_key  = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlhMEW4VyLTWUwtT97rwCyN8mdej6cIUFqlbYlGZFvvSw1Gljm2W19ba1r4N5hltdkEbAA3HD7KF1miZ57eK5z7Awe1L5FiQDOXviuXI+4c0EE8yH10Gx/wvBo9Q09ZO/i2ZuDFNdAy1X0hH7TQkf+HP9QMjfMifSkaE42KTA1ovuC0U9xU88MUCcB+LIy3rqDPd+n5dhBQ7u53jR/VKbtttR4myZ5E/Dai74HkVwZNCH/AbKxOoOH4cVuPeJ5aynRG+JgK5pHhCpinj/gGTjK7F1IJ8CZb3Tv2b1NeK+W59XeZ8WO0ODfpMWF/8MfkJdKjLT8EuRCeJwptRwG3zxyQIDAQAB";

    // 签名方式
    public static String sign_type = "RSA2";

    // 调试用，创建TXT日志文件夹路径，见AlipayCore.java类中的logResult(String sWord)打印方法。
    public static String log_path ="C://";

    // 字符编码格式 目前支持 gbk 或 utf-8
    public static String input_charset = "utf-8";

    // 接收通知的接口名
    public static String service = "http://116.62.65.133:8080/wuliu-web/pay/notify";
    //public static String service = "mobile.securitypay.pay";

    //APPID
    public static String app_id="2017061407489958";
    

}
