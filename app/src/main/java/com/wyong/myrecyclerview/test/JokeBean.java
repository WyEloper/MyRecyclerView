package com.wyong.myrecyclerview.test;

import java.util.List;

/**
 * https://api.apiopen.top/getJoke
 *
 * 右键 --> Generate... --> GsonFormatPlus 或者 Getter and Setter
 * 自动生成 Bean 类
 */
public class JokeBean {

    public JokeBean(int code, String message, List<ResultDTO> result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }

    @Override
    public String toString() {
        return "JokeBean{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }

    /**
     * code : 200
     * message : 成功!
     * result : [{"sid":"30004672","text":"第一天回来不认识，回来两天黏上我了","type":"video","thumbnail":"http://wimg.spriteapp.cn/picture/2020/0106/5e1309418388a_wpd.jpg","video":"http://uvideo.spriteapp.cn/video/2020/0106/5e1309418388a_wpd.mp4","images":null,"up":"186","down":"9","forward":"1","comment":"8","uid":"23117224","name":"为什么想个名字都这么难","header":"http://thirdwx.qlogo.cn/mmopen/vi_32/DYAIOgq83erseh1GZ2RVo5ZPFPiarwlaWN1yPWMHQGSZMHIDPeOvUVVG9JYXwDjQAPqqw2on9x0dKuR4H2dfk0g/132","top_comments_content":"很纯的田园犬\u2026\u2026","top_comments_voiceuri":"","top_comments_uid":"21664145","top_comments_name":"狼道","top_comments_header":"http://wx.qlogo.cn/mmopen/vi_32/8jAGNzDokiaicD14SLjYiaArIjk5icKMfwNXYkuzWfqeGTHO7H0ghuzMAoiaVoYiaADA0JZ1BEESIFUvdmAd3XmkZrjQ/0","passtime":"2020-01-09 09:10:02"},{"sid":"29897153","text":"美国淘旧货能赚多少钱？定个小目标，先赚1500！","type":"video","thumbnail":"http://wimg.spriteapp.cn/picture/2019/1031/5dbab19c3812d_wpd.jpg","video":"http://uvideo.spriteapp.cn/video/2019/1031/5dbab19c3812d_wpd.mp4","images":null,"up":"95","down":"2","forward":"0","comment":"17","uid":"23129616","name":"甯祥","header":"http://wimg.spriteapp.cn/profile/large/2019/07/04/5d1d7514d187e_mini.jpg","top_comments_content":null,"top_comments_voiceuri":null,"top_comments_uid":null,"top_comments_name":null,"top_comments_header":null,"passtime":"2019-11-02 21:08:02"},{"sid":"29482983","text":"姐夫们，是你们发挥的时候了","type":"image","thumbnail":null,"video":null,"images":"http://wimg.spriteapp.cn/ugc/2019/05/18/5cdf665d67b9d_1.jpg","up":"205","down":"15","forward":"2","comment":"102","uid":"16336286","name":"我是球球的球迷 [公众号]","header":"http://wimg.spriteapp.cn/profile/large/2018/05/04/5aebcb55c0c3c_mini.jpg","top_comments_content":"喝着酒 望着地 能吐一地是一地  横批  明天继续","top_comments_voiceuri":"","top_comments_uid":"22965475","top_comments_name":"用户9oietw","top_comments_header":"http://thirdwx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTLU3Dqic1Ssf26d1Y8crBIYvibDntgUQl2zdcFNTJcGUoZt1n872NiaeLCGyODxc1GtWibrhicnLpjlCiag/132","passtime":"2019-05-20 18:34:02"},{"sid":"29397947","text":"同样是跳水，你为何如此优秀","type":"video","thumbnail":"http://wimg.spriteapp.cn/picture/2019/0416/5cb565cbcef6b__b.jpg","video":"http://wvideo.spriteapp.cn/video/2019/0416/5cb565cbe1980_wpd.mp4","images":null,"up":"134","down":"3","forward":"2","comment":"24","uid":"21601008","name":"A_phrod_i_te","header":"http://wimg.spriteapp.cn/profile/large/2019/04/01/5ca18df484b5f_mini.jpg","top_comments_content":null,"top_comments_voiceuri":null,"top_comments_uid":null,"top_comments_name":null,"top_comments_header":null,"passtime":"2019-04-18 00:58:03"},{"sid":"30045197","text":"像极了过年要压岁钱的你","type":"gif","thumbnail":"http://wimg.spriteapp.cn/ugc/2020/01/16/5e2024d7333fd_a_1.jpg","video":null,"images":"http://wimg.spriteapp.cn/ugc/2020/01/16/5e2024d7333fd.gif","up":"125","down":"4","forward":"2","comment":"5","uid":"15299575","name":"笑品百味人生","header":"http://qzapp.qlogo.cn/qzapp/100336987/D717E1D771EA0C38EE4F8BFC9C02E756/100","top_comments_content":null,"top_comments_voiceuri":null,"top_comments_uid":null,"top_comments_name":null,"top_comments_header":null,"passtime":"2020-01-18 11:16:01"},{"sid":"29347305","text":"美女邻居从来不拉窗帘竟遭投诉，这\u2026\u2026","type":"video","thumbnail":"http://wimg.spriteapp.cn/picture/2019/0401/5ca1dbb34846c_wpd.jpg","video":"http://uvideo.spriteapp.cn/video/2019/0401/5ca1dbb34846c_wpd.mp4","images":null,"up":"131","down":"7","forward":"4","comment":"4","uid":"19414702","name":"一本噵长","header":"http://wimg.spriteapp.cn/profile/large/2018/07/22/5b53f6a8bc904_mini.jpg","top_comments_content":"坐标发给我、没别的、主要是想减肥","top_comments_voiceuri":"","top_comments_uid":"23037139","top_comments_name":"四方客","top_comments_header":"http://thirdwx.qlogo.cn/mmopen/vi_32/vZXWnuBOtWxtByGiajl4NAOJYjmicm99OibMj5xgt5sgDUK7WEicIwTVZorS3XfHbBJvsAicNjwT4DCUMLYuuX9f90A/132","passtime":"2019-04-04 00:28:01"},{"sid":"28726185","text":"这是青春！这就是亲情！","type":"video","thumbnail":"http://wimg.spriteapp.cn/picture/2018/1017/28726185_453.jpg","video":"http://wvideo.spriteapp.cn/video/2018/1017/9e466e30d1e811e893a2842b2b4c75ab_wpd.mp4","images":null,"up":"675","down":"18","forward":"25","comment":"84","uid":"19634336","name":"全球领先在线视频 [OMEGA帮派]","header":"http://wimg.spriteapp.cn/profile/large/2018/08/06/5b6742613dbe7_mini.jpg","top_comments_content":"孝心不分有钱人和穷人，纯粹的让老人开心","top_comments_voiceuri":"","top_comments_uid":"15441348","top_comments_name":"开花仙人掌","top_comments_header":"http://qzapp.qlogo.cn/qzapp/100336987/0DF1572CF398AAB9893ADAAA22957CC5/100","passtime":"2018-10-17 21:32:01"},{"sid":"29173397","text":"小奶音萌到爆！","type":"video","thumbnail":"http://wimg.spriteapp.cn/picture/2019/0130/89447c20249f11e99978842b2b4c75ab_wpd.jpg","video":"http://wvideo.spriteapp.cn/video/2019/0130/89447c20249f11e99978842b2b4c75ab_wpd.mp4","images":null,"up":"228","down":"11","forward":"2","comment":"21","uid":"22963336","name":"动物集锦汇","header":"http://wimg.spriteapp.cn/profile/20181020165701889500.jpg","top_comments_content":"或许它在说：赶紧放了劳资，送我回大海！","top_comments_voiceuri":"","top_comments_uid":"9445669","top_comments_name":"不得姐用户","top_comments_header":"http://qzapp.qlogo.cn/qzapp/100336987/4237A269B0D7442FEC1FD5B322CE1D17/100","passtime":"2019-01-31 22:19:02"},{"sid":"29755916","text":"我就奇怪，她带这个干嘛","type":"video","thumbnail":"http://wimg.spriteapp.cn/picture/2019/0906/5d71d84d5e43c_wpd.jpg","video":"http://wvideo.spriteapp.cn/video/2019/0906/5d71d84d5e43c_wpd.mp4","images":null,"up":"324","down":"16","forward":"4","comment":"48","uid":"23122931","name":"阿尔的麦垛","header":"http://wimg.spriteapp.cn/profile/large/2019/07/03/5d1c79c8ab2f1_mini.jpg","top_comments_content":"大舅哥，我抗揍","top_comments_voiceuri":"","top_comments_uid":"13078789","top_comments_name":"猪弟555","top_comments_header":"http://wimg.spriteapp.cn/profile","passtime":"2019-09-06 20:00:01"},{"sid":"29346938","text":"女追男隔层山","type":"video","thumbnail":"http://wimg.spriteapp.cn/picture/2019/0401/f9d256a2-5450-11e9-ad0c-1866daeb0df1_wpd.jpg","video":"http://wvideo.spriteapp.cn/video/2019/0401/f9d256a2-5450-11e9-ad0c-1866daeb0df1_wpd.mp4","images":null,"up":"199","down":"11","forward":"3","comment":"17","uid":"22904197","name":"最爆笑","header":"http://wimg.spriteapp.cn/profile/20180809175602917448.jpeg","top_comments_content":"再过半小时就是我生日了，玩百思四年了，各位姐夫能祝我生日快乐吗","top_comments_voiceuri":"","top_comments_uid":"18841914","top_comments_name":"违规昵称捌壹柒","top_comments_header":"http://wimg.spriteapp.cn/profile/large/2017/09/03/59ac06878844c_mini.jpg","passtime":"2019-04-01 22:33:02"},{"sid":"29737565","text":"有个闺蜜交了一个男朋友，发现他有个缺陷，两人不匹配。又不好意思直说。一天闺蜜拉着这个男的去逛花鸟市场，指着笼子里的鸟说：这只被抓住的鸟好小啊！然后抬头看看天上飞的鸟说：这只大！那只更大！后来这个男的就知难而退了\u2026\u2026\u2026","type":"text","thumbnail":null,"video":null,"images":null,"up":"111","down":"10","forward":"0","comment":"12","uid":"23126688","name":"海盗船","header":"http://wimg.spriteapp.cn/profile/large/2019/07/04/5d1d6b5ad07f8_mini.jpg","top_comments_content":"一般说闺蜜的都是指自己","top_comments_voiceuri":"","top_comments_uid":"20020572","top_comments_name":"Kevinwpeizh","top_comments_header":"http://wimg.spriteapp.cn/profile/large/2019/03/22/5c94e102ddef4_mini.jpg","passtime":"2019-08-30 13:58:01"},{"sid":"30289320","text":"Wtf ？？？？？","type":"video","thumbnail":"http://wimg.spriteapp.cn/picture/2020/0220/5e4dcd8642dd6_wpd.jpg","video":"http://uvideo.spriteapp.cn/video/2020/0220/5e4dcd8642dd6_wpd.mp4","images":null,"up":"122","down":"7","forward":"9","comment":"10","uid":"23125280","name":"朝花夕颜","header":"http://wimg.spriteapp.cn/profile/large/2019/07/04/5d1d64d99b3d6_mini.jpg","top_comments_content":"不是在口吗？？","top_comments_voiceuri":"","top_comments_uid":"23128225","top_comments_name":"蕾儿","top_comments_header":"http://wimg.spriteapp.cn/profile/large/2019/07/04/5d1d7060c181f_mini.jpg","passtime":"2020-02-21 20:54:02"},{"sid":"29488168","text":"圆了我和妈咪的拍照梦！","type":"video","thumbnail":"http://wimg.spriteapp.cn/picture/2019/0521/29488168_325.jpg","video":"http://uvideo.spriteapp.cn/video/2019/0521/f4d14c16-7b75-11e9-90a2-1866daeb0df1_wpd.mp4","images":null,"up":"184","down":"9","forward":"0","comment":"21","uid":"23083310","name":"情感社区","header":"http://wimg.spriteapp.cn/profile/20190422155827127289.jpg","top_comments_content":null,"top_comments_voiceuri":null,"top_comments_uid":null,"top_comments_name":null,"top_comments_header":null,"passtime":"2019-05-21 20:45:02"},{"sid":"29939845","text":"鲨鱼狗狗爱摸摸。","type":"gif","thumbnail":"http://wimg.spriteapp.cn/ugc/2019/11/19/5dd39a1277137_a_1.jpg","video":null,"images":"http://wimg.spriteapp.cn/ugc/2019/11/19/5dd39a1277137.gif","up":"93","down":"7","forward":"0","comment":"18","uid":"23128251","name":"愣愣的小盆友","header":"http://wimg.spriteapp.cn/profile/large/2019/07/04/5d1d706772cf5_mini.jpg","top_comments_content":"它是馋你的身子","top_comments_voiceuri":"","top_comments_uid":"23135334","top_comments_name":"醉清风","top_comments_header":"http://wimg.spriteapp.cn/profile/large/2019/07/04/5d1dafe002c07_mini.jpg","passtime":"2019-11-20 20:48:01"},{"sid":"29955687","text":"这大概是成年人世界里的悲哀之一吧","type":"image","thumbnail":null,"video":null,"images":"http://wimg.spriteapp.cn/ugc/2019/11/28/5ddefcb54aefd_1.jpg","up":"203","down":"7","forward":"4","comment":"14","uid":"20869594","name":"典一","header":"http://wimg.spriteapp.cn/profile/large/2019/11/22/5dd7af9b5f070_mini.jpg","top_comments_content":"我不但把梦想弄丢了，连自己最喜欢什么都记不起了","top_comments_voiceuri":"","top_comments_uid":"8018209","top_comments_name":"昵称审核未通过","top_comments_header":"http://wimg.spriteapp.cn/profile/large/2018/08/19/5b795bac085b6_mini.jpg","passtime":"2019-11-30 14:44:01"},{"sid":"29909614","text":"扯把子系列","type":"image","thumbnail":null,"video":null,"images":"http://wimg.spriteapp.cn/ugc/2019/11/05/5dc1844a6c8fc_1.jpg","up":"112","down":"10","forward":"1","comment":"2","uid":"15704485","name":"成都李扯火","header":"http://wimg.spriteapp.cn/profile","top_comments_content":null,"top_comments_voiceuri":null,"top_comments_uid":null,"top_comments_name":null,"top_comments_header":null,"passtime":"2019-11-07 10:32:01"},{"sid":"29822455","text":"争取早日有钱，切枯燥。","type":"video","thumbnail":"http://wimg.spriteapp.cn/picture/2019/1004/5d963948d2257_wpd.jpg","video":"http://uvideo.spriteapp.cn/video/2019/1004/5d963948d2257_wpd.mp4","images":null,"up":"196","down":"10","forward":"0","comment":"5","uid":"22665829","name":"废品枯燥粉丝团","header":"http://wimg.spriteapp.cn/profile/large/2018/06/11/5b1d73476c9ec_mini.jpg","top_comments_content":"这个回扣拿的可以。。。。","top_comments_voiceuri":"","top_comments_uid":"11526904","top_comments_name":"拔萝卜的兔子","top_comments_header":"http://wimg.spriteapp.cn/profile/large/2017/01/03/586b9c03ed704_mini.jpg","passtime":"2019-10-08 21:30:02"},{"sid":"30560056","text":"好吃不过饺子，好....站着不如倒着。","type":"video","thumbnail":"http://wimg.spriteapp.cn/picture/2020/0306/5e61b88da6a0f_wpd.jpg","video":"http://uvideo.spriteapp.cn/video/2020/0306/5e61b88da6a0f_wpd.mp4","images":null,"up":"98","down":"22","forward":"0","comment":"8","uid":"23134046","name":"夜独醉","header":"http://wimg.spriteapp.cn/profile/large/2019/07/04/5d1da08f76b3a_mini.jpg","top_comments_content":null,"top_comments_voiceuri":null,"top_comments_uid":null,"top_comments_name":null,"top_comments_header":null,"passtime":"2020-03-08 20:58:01"},{"sid":"29305504","text":"这些女生的小秘密，男生肯定不知道......","type":"image","thumbnail":null,"video":null,"images":"http://wimg.spriteapp.cn/ugc/2019/03/18/5c8ee700918a6_1.jpg","up":"168","down":"15","forward":"13","comment":"21","uid":"17588230","name":"神马情况 [有容乃悦]","header":"http://wimg.spriteapp.cn/profile/large/2018/03/21/5ab21157ebeaa_mini.jpg","top_comments_content":null,"top_comments_voiceuri":null,"top_comments_uid":null,"top_comments_name":null,"top_comments_header":null,"passtime":"2019-03-18 21:30:01"},{"sid":"30716055","text":"废旧轴承不要扔，焊个手柄上去还有这样的功能，我怎么没想到呢","type":"video","thumbnail":"http://wimg.spriteapp.cn/picture/2020/0312/5e698eda27d77_wpd.jpg","video":"http://uvideo.spriteapp.cn/video/2020/0312/5e698eda27d77_wpd.mp4","images":null,"up":"114","down":"14","forward":"0","comment":"25","uid":"23130108","name":"普本一铎丶","header":"http://wimg.spriteapp.cn/profile/large/2019/07/04/5d1d89ac22cae_mini.jpg","top_comments_content":null,"top_comments_voiceuri":null,"top_comments_uid":null,"top_comments_name":null,"top_comments_header":null,"passtime":"2020-03-13 14:22:01"}]
     */

    public int code;
    public String message;
    public List<ResultDTO> result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ResultDTO> getResult() {
        return result;
    }

    public void setResult(List<ResultDTO> result) {
        this.result = result;
    }

    public static class ResultDTO {
        /**
         * sid : 30004672
         * text : 第一天回来不认识，回来两天黏上我了
         * type : video
         * thumbnail : http://wimg.spriteapp.cn/picture/2020/0106/5e1309418388a_wpd.jpg
         * video : http://uvideo.spriteapp.cn/video/2020/0106/5e1309418388a_wpd.mp4
         * images : null
         * up : 186
         * down : 9
         * forward : 1
         * comment : 8
         * uid : 23117224
         * name : 为什么想个名字都这么难
         * header : http://thirdwx.qlogo.cn/mmopen/vi_32/DYAIOgq83erseh1GZ2RVo5ZPFPiarwlaWN1yPWMHQGSZMHIDPeOvUVVG9JYXwDjQAPqqw2on9x0dKuR4H2dfk0g/132
         * top_comments_content : 很纯的田园犬……
         * top_comments_voiceuri :
         * top_comments_uid : 21664145
         * top_comments_name : 狼道
         * top_comments_header : http://wx.qlogo.cn/mmopen/vi_32/8jAGNzDokiaicD14SLjYiaArIjk5icKMfwNXYkuzWfqeGTHO7H0ghuzMAoiaVoYiaADA0JZ1BEESIFUvdmAd3XmkZrjQ/0
         * passtime : 2020-01-09 09:10:02
         */

        public String sid;
        public String text;
        public String type;
        public String thumbnail;
        public String video;
        public Object images;
        public String up;
        public String down;
        public String forward;
        public String comment;
        public String uid;
        public String name;
        public String header;
        public String top_comments_content;
        public String top_comments_voiceuri;
        public String top_comments_uid;
        public String top_comments_name;
        public String top_comments_header;
        public String passtime;

        public String getSid() {
            return sid;
        }

        public void setSid(String sid) {
            this.sid = sid;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public String getVideo() {
            return video;
        }

        public void setVideo(String video) {
            this.video = video;
        }

        public Object getImages() {
            return images;
        }

        public void setImages(Object images) {
            this.images = images;
        }

        public String getUp() {
            return up;
        }

        public void setUp(String up) {
            this.up = up;
        }

        public String getDown() {
            return down;
        }

        public void setDown(String down) {
            this.down = down;
        }

        public String getForward() {
            return forward;
        }

        public void setForward(String forward) {
            this.forward = forward;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getHeader() {
            return header;
        }

        public void setHeader(String header) {
            this.header = header;
        }

        public String getTop_comments_content() {
            return top_comments_content;
        }

        public void setTop_comments_content(String top_comments_content) {
            this.top_comments_content = top_comments_content;
        }

        public String getTop_comments_voiceuri() {
            return top_comments_voiceuri;
        }

        public void setTop_comments_voiceuri(String top_comments_voiceuri) {
            this.top_comments_voiceuri = top_comments_voiceuri;
        }

        public String getTop_comments_uid() {
            return top_comments_uid;
        }

        public void setTop_comments_uid(String top_comments_uid) {
            this.top_comments_uid = top_comments_uid;
        }

        public String getTop_comments_name() {
            return top_comments_name;
        }

        public void setTop_comments_name(String top_comments_name) {
            this.top_comments_name = top_comments_name;
        }

        public String getTop_comments_header() {
            return top_comments_header;
        }

        public void setTop_comments_header(String top_comments_header) {
            this.top_comments_header = top_comments_header;
        }

        public String getPasstime() {
            return passtime;
        }

        public void setPasstime(String passtime) {
            this.passtime = passtime;
        }
    }
}
