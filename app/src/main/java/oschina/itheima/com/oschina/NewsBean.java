package oschina.itheima.com.oschina;

import org.itheima.recycler.bean.BasePageBean;

import java.util.List;

/**
 * Created by HYM on 2018/5/9 0009.
 * https://www.oschina.net/action/apiv2/news?pagetoken
 */

public class NewsBean extends BasePageBean<NewsBean.ResultBean>{


    /**
     * code : 1
     * message : success
     * result : {"items":[{"author":"淡漠悠然","body":"jemalloc 5.1.0 已发布，jemalloc 是一个通用的 malloc（3）实现，它强调了分段回避和可伸缩并发支持。jemalloc 在 2005 年首次作为 FreeBSD libc...","commentCount":1,"href":"https://www.oschina.net/news/95919/jemalloc-5-1-0-released","id":95919,"pubDate":"2018-05-09 13:36:16","recommend":true,"title":"jemalloc 5.1.0 发布，内存分配管理","type":6,"viewCount":206},{"author":"静静的风","body":"DBShop 电子商务网店系统，采用PHP官方框架 ZendFramework 2 开发而成。在网上建立自己的店铺、自己的销售网站的不二之选。强大的后台管理及简单的...","commentCount":0,"href":"https://www.oschina.net/news/95918/dbshop-1-2-beta-20180508","id":95918,"pubDate":"2018-05-09 12:18:21","recommend":true,"title":"商城系统 DBShop V1.2 Beta 20180508 发布","type":6,"viewCount":54},{"author":"局长","body":"开奖啦~开源中国社区翻译贡献计划 2018 年 3-4 月翻译贡献会员 TOP 10 正式出炉（中奖的朋友赶紧把你们的快递信息私信给@局长）！同时 2018 年 5-...","commentCount":1,"href":"https://www.oschina.net/question/2720166_2279403","id":2279403,"pubDate":"2018-05-09 11:48:05","recommend":true,"title":"开源中国翻译频道贡献 2018(3-4月) 奖励名单","type":2,"viewCount":250},{"author":"RememBerBe","body":"WePush v2.1.0 已发布，它是一个专注批量推送的小而美的工具，目前支持的消息类型：模板消息-公众号、模板消息-小程序、微信客服消息、阿里云短信、...","commentCount":6,"href":"https://www.oschina.net/news/95916/wepush-2-1-0-released","id":95916,"pubDate":"2018-05-09 10:19:56","recommend":true,"title":"WePush v2.1.0 发布，专注批量推送的小而美的工具","type":6,"viewCount":1080},{"author":"红薯","body":"请问你知道你公司多少开发人员，分几个组，每天都在做什么吗？ 知道！我们公司（开源中国）一共 85 个开发人员（包括设计和相关人员），分 6 个组，...","commentCount":37,"href":"https://www.oschina.net/news/95915/gitee-enterprise-new-release","id":95915,"pubDate":"2018-05-09 08:44:34","recommend":true,"title":"知道你公司多少开发人员，几个组，每天都在做什么吗？","type":6,"viewCount":3111},{"author":"王练","body":"2018 Google I/O 开发者大会已于北京时间 5 月 9 日凌晨在山景城正式启幕，一起来看一下大会第一天都有哪些与开发者直接相关的内容吧。 Android ...","commentCount":11,"href":"https://www.oschina.net/news/95914/2018-google-io-highlights","id":95914,"pubDate":"2018-05-09 08:43:23","recommend":false,"title":"2018 Google I/O 大会亮点汇总：新系统、新工具","type":6,"viewCount":4286},{"author":"王练","body":"Intellij IDEA真是越用越觉得它强大，它总是在我们写代码的时候，不时给我们来个小惊喜。出于对Intellij IDEA的喜爱，我决定写一个与其相关的专栏或...","commentCount":45,"href":"https://my.oschina.net/samgege/blog/1808622","id":1808622,"pubDate":"2018-05-09 08:41:18","recommend":false,"title":"每日一博 | Intellij IDEA 神器居然还有这些小技巧","type":3,"viewCount":3874},{"author":"王练","body":"FlutterOSC 是基于 Google Flutter 的开源中国客户端，支持 Android 和 iOS 。功能包括登录（使用osc账号）、 查看资讯（未登录即可查看）、查看、...","commentCount":0,"href":"https://gitee.com/yubo725/FlutterOSC","id":95912,"pubDate":"2018-05-09 08:41:16","recommend":false,"title":"码云推荐 | 基于 Google Flutter 的开源中国客户端","type":0,"viewCount":3},{"author":"王练","body":"【APP端动弹话题有奖互动第三弹\u2014\u2014程独秀，你过来！】究竟程序猿是找不女朋友还是不想找呢？来，请说出你的想法或故事~（APP端发动弹话题才算参与...","commentCount":0,"href":"https://www.oschina.net/tweet-topic/%E7%A8%8B%E5%BA%8F%E5%91%98%E6%89%BE%E4%B8%8D%E5%88%B0%E5%A5%B3%E6%9C%8B%E5%8F%8B%EF%BC%9F","id":95911,"pubDate":"2018-05-09 08:38:59","recommend":false,"title":"APP 端动弹话题有奖互动 \u2014\u2014 程序员找不到女朋友？","type":0,"viewCount":2},{"author":"王练","body":"2017年是小程序跌宕起伏的一年，从一夜爆红到沉寂无声再到回归正轨，同样也是小程序按部就班布局生长的一年。那么，微信小程序到底能不能发展起来？...","commentCount":0,"href":"https://blog.gitee.com/2018/05/07/weekly071/","id":95910,"pubDate":"2018-05-09 08:36:48","recommend":false,"title":"码云周刊 | 这些热门的微信小程序值得推荐","type":0,"viewCount":2},{"author":"局长","body":"谷歌的 Flutter 团队宣布推出了 Flutter 的第三个 beta 版本，旨在让开发者在 iOS 和 Android 上创建高质量的原生用户体验。 作为一名移动 APP 开...","commentCount":16,"href":"https://www.oschina.net/news/95909/flutter-beta3-released","id":95909,"pubDate":"2018-05-09 08:30:41","recommend":false,"title":"谷歌的 Mobile UI 框架 Flutter Beta 3 发布","type":6,"viewCount":3190},{"author":"王练","body":"FeatherCNN 由腾讯 AI 平台部研发，基于 ARM 架构开发的高效神经网络前向计算库，核心算法已申请专利。该计算库支持 caffe 模型，具有无依赖，速度...","commentCount":4,"href":"https://www.oschina.net/p/feathercnn","id":47204,"pubDate":"2018-05-09 08:28:59","recommend":false,"title":"FeatherCNN \u2014\u2014 腾讯高性能神经网络前向计算库","type":1,"viewCount":895},{"author":"王练","body":"大型网站的架构是根据业务需求不断完善的，根据不同的业务特征会做特定的设计和考虑，本文只是讲述一个常规大型网站会涉及的一些技术和手段，希望能...","commentCount":7,"href":"https://my.oschina.net/editorial-story/blog/1808757","id":1808757,"pubDate":"2018-05-09 08:27:56","recommend":false,"title":"大型分布式电商系统架构是如何从 0 开始演进的？","type":3,"viewCount":2076},{"author":"王练","body":"在微软 Build 2018 开发者大会上，.NET 团队发布了 .NET Core 的下一个主要版本 3.0 的规划蓝图。.Net Core 3 的首个预览版预计在今年晚些时候发布...","commentCount":23,"href":"https://www.oschina.net/news/95906/dotnet-core-3-new-features","id":95906,"pubDate":"2018-05-09 08:26:34","recommend":false,"title":".NET Core 3 新特性公布：支持 Windows 桌面应用","type":6,"viewCount":2383},{"author":"王练","body":"小猪从噩梦中惊醒，哭着对妈妈说：\u201c我梦见自己长大后成了水手，可是我不喜欢当水手。\u201d 猪妈妈安慰他道：\u201c不要怕孩子，梦都是反的啊。\u201d 果然，小...","commentCount":29,"href":"https://my.oschina.net/xxiaobian/blog/1809255","id":1809255,"pubDate":"2018-05-09 08:25:26","recommend":false,"title":"OSChina 周三乱弹 \u2014\u2014 姑娘不是我的心上人，请自重","type":3,"viewCount":2536},{"author":"王练","body":"PYPL 5 月最新 IDE 指数已发布，搜索最多的前三大 IDE 分别是 Visual Studio、Eclipse 和 Android Studio 。其中，Visual Studio 和 Eclipse 的指...","commentCount":25,"href":"https://www.oschina.net/news/95904/pypl-may-top-ide-index","id":95904,"pubDate":"2018-05-09 08:24:33","recommend":false,"title":"PYPL 5 月 IDE 指数榜：VS 和 Eclipse 争夺最强 IDE","type":6,"viewCount":1353},{"author":"王练","body":"去年年底曾有外媒报道，由于社区用户的强烈要求，微软正考虑添加 Python 作为官方的一种 Excel 脚本语言。不过在昨天的 Build 2018 开发者大会上，...","commentCount":12,"href":"https://www.oschina.net/news/95903/excel-support-javascript","id":95903,"pubDate":"2018-05-09 08:23:24","recommend":false,"title":"没有 Python，微软宣布 Excel 新增 JavaScript 支持","type":6,"viewCount":1496},{"author":"局长","body":"Google 2018 I/O 大会正在进行，Android P Beta 公测版目前已经发布。 下载地址 >>> https://developer.android.com/preview/download Android P ...","commentCount":4,"href":"https://www.oschina.net/news/95902/android-p-beta-released","id":95902,"pubDate":"2018-05-09 08:17:19","recommend":false,"title":"带来手势操作的 Android P beta 发布，Pixel 尝鲜","type":6,"viewCount":1477},{"author":"所以呢","body":"hi-nginx-1.4.8正式发布。 更新： nginx升级至1.14.0 升级hi-project脚本，创建工程更灵活方便 支持java 10 添加hi_lua_package_path 和 hi_lua_p...","commentCount":2,"href":"https://www.oschina.net/news/95901/hi-nginx-1-4-8-released","id":95901,"pubDate":"2018-05-09 08:11:10","recommend":false,"title":"hi-nginx-1.4.8 正式发布，新增一组命令","type":6,"viewCount":818},{"author":"局长","body":"Spring Framework 4.3.17 和 5.0.6 已发布，可从 repo.spring.io 和 Maven Central 获取更新。 官方表示，Spring Framework 4.3.17 包含了 15...","commentCount":5,"href":"https://www.oschina.net/news/95900/spring-framework-4-3-17-and-5-0-6-released","id":95900,"pubDate":"2018-05-09 08:04:04","recommend":false,"title":"Spring Framework 4.3.17 和 5.0.6 带来 Bug 修复和改进","type":6,"viewCount":973}],"nextPageToken":"DBA816934CD0AA59","prevPageToken":"0997C855C600E421","requestCount":20,"responseCount":20,"totalResults":88186}
     * time : 2018-05-09 15:09:31
     */

    private int code;
    private String message;
    private ResultBean result;
    private String time;

    @Override
    public List getItemDatas() {
        return result.items;
    }

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

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public static class ResultBean {
        /**
         * items : [{"author":"淡漠悠然","body":"jemalloc 5.1.0 已发布，jemalloc 是一个通用的 malloc（3）实现，它强调了分段回避和可伸缩并发支持。jemalloc 在 2005 年首次作为 FreeBSD libc...","commentCount":1,"href":"https://www.oschina.net/news/95919/jemalloc-5-1-0-released","id":95919,"pubDate":"2018-05-09 13:36:16","recommend":true,"title":"jemalloc 5.1.0 发布，内存分配管理","type":6,"viewCount":206},{"author":"静静的风","body":"DBShop 电子商务网店系统，采用PHP官方框架 ZendFramework 2 开发而成。在网上建立自己的店铺、自己的销售网站的不二之选。强大的后台管理及简单的...","commentCount":0,"href":"https://www.oschina.net/news/95918/dbshop-1-2-beta-20180508","id":95918,"pubDate":"2018-05-09 12:18:21","recommend":true,"title":"商城系统 DBShop V1.2 Beta 20180508 发布","type":6,"viewCount":54},{"author":"局长","body":"开奖啦~开源中国社区翻译贡献计划 2018 年 3-4 月翻译贡献会员 TOP 10 正式出炉（中奖的朋友赶紧把你们的快递信息私信给@局长）！同时 2018 年 5-...","commentCount":1,"href":"https://www.oschina.net/question/2720166_2279403","id":2279403,"pubDate":"2018-05-09 11:48:05","recommend":true,"title":"开源中国翻译频道贡献 2018(3-4月) 奖励名单","type":2,"viewCount":250},{"author":"RememBerBe","body":"WePush v2.1.0 已发布，它是一个专注批量推送的小而美的工具，目前支持的消息类型：模板消息-公众号、模板消息-小程序、微信客服消息、阿里云短信、...","commentCount":6,"href":"https://www.oschina.net/news/95916/wepush-2-1-0-released","id":95916,"pubDate":"2018-05-09 10:19:56","recommend":true,"title":"WePush v2.1.0 发布，专注批量推送的小而美的工具","type":6,"viewCount":1080},{"author":"红薯","body":"请问你知道你公司多少开发人员，分几个组，每天都在做什么吗？ 知道！我们公司（开源中国）一共 85 个开发人员（包括设计和相关人员），分 6 个组，...","commentCount":37,"href":"https://www.oschina.net/news/95915/gitee-enterprise-new-release","id":95915,"pubDate":"2018-05-09 08:44:34","recommend":true,"title":"知道你公司多少开发人员，几个组，每天都在做什么吗？","type":6,"viewCount":3111},{"author":"王练","body":"2018 Google I/O 开发者大会已于北京时间 5 月 9 日凌晨在山景城正式启幕，一起来看一下大会第一天都有哪些与开发者直接相关的内容吧。 Android ...","commentCount":11,"href":"https://www.oschina.net/news/95914/2018-google-io-highlights","id":95914,"pubDate":"2018-05-09 08:43:23","recommend":false,"title":"2018 Google I/O 大会亮点汇总：新系统、新工具","type":6,"viewCount":4286},{"author":"王练","body":"Intellij IDEA真是越用越觉得它强大，它总是在我们写代码的时候，不时给我们来个小惊喜。出于对Intellij IDEA的喜爱，我决定写一个与其相关的专栏或...","commentCount":45,"href":"https://my.oschina.net/samgege/blog/1808622","id":1808622,"pubDate":"2018-05-09 08:41:18","recommend":false,"title":"每日一博 | Intellij IDEA 神器居然还有这些小技巧","type":3,"viewCount":3874},{"author":"王练","body":"FlutterOSC 是基于 Google Flutter 的开源中国客户端，支持 Android 和 iOS 。功能包括登录（使用osc账号）、 查看资讯（未登录即可查看）、查看、...","commentCount":0,"href":"https://gitee.com/yubo725/FlutterOSC","id":95912,"pubDate":"2018-05-09 08:41:16","recommend":false,"title":"码云推荐 | 基于 Google Flutter 的开源中国客户端","type":0,"viewCount":3},{"author":"王练","body":"【APP端动弹话题有奖互动第三弹\u2014\u2014程独秀，你过来！】究竟程序猿是找不女朋友还是不想找呢？来，请说出你的想法或故事~（APP端发动弹话题才算参与...","commentCount":0,"href":"https://www.oschina.net/tweet-topic/%E7%A8%8B%E5%BA%8F%E5%91%98%E6%89%BE%E4%B8%8D%E5%88%B0%E5%A5%B3%E6%9C%8B%E5%8F%8B%EF%BC%9F","id":95911,"pubDate":"2018-05-09 08:38:59","recommend":false,"title":"APP 端动弹话题有奖互动 \u2014\u2014 程序员找不到女朋友？","type":0,"viewCount":2},{"author":"王练","body":"2017年是小程序跌宕起伏的一年，从一夜爆红到沉寂无声再到回归正轨，同样也是小程序按部就班布局生长的一年。那么，微信小程序到底能不能发展起来？...","commentCount":0,"href":"https://blog.gitee.com/2018/05/07/weekly071/","id":95910,"pubDate":"2018-05-09 08:36:48","recommend":false,"title":"码云周刊 | 这些热门的微信小程序值得推荐","type":0,"viewCount":2},{"author":"局长","body":"谷歌的 Flutter 团队宣布推出了 Flutter 的第三个 beta 版本，旨在让开发者在 iOS 和 Android 上创建高质量的原生用户体验。 作为一名移动 APP 开...","commentCount":16,"href":"https://www.oschina.net/news/95909/flutter-beta3-released","id":95909,"pubDate":"2018-05-09 08:30:41","recommend":false,"title":"谷歌的 Mobile UI 框架 Flutter Beta 3 发布","type":6,"viewCount":3190},{"author":"王练","body":"FeatherCNN 由腾讯 AI 平台部研发，基于 ARM 架构开发的高效神经网络前向计算库，核心算法已申请专利。该计算库支持 caffe 模型，具有无依赖，速度...","commentCount":4,"href":"https://www.oschina.net/p/feathercnn","id":47204,"pubDate":"2018-05-09 08:28:59","recommend":false,"title":"FeatherCNN \u2014\u2014 腾讯高性能神经网络前向计算库","type":1,"viewCount":895},{"author":"王练","body":"大型网站的架构是根据业务需求不断完善的，根据不同的业务特征会做特定的设计和考虑，本文只是讲述一个常规大型网站会涉及的一些技术和手段，希望能...","commentCount":7,"href":"https://my.oschina.net/editorial-story/blog/1808757","id":1808757,"pubDate":"2018-05-09 08:27:56","recommend":false,"title":"大型分布式电商系统架构是如何从 0 开始演进的？","type":3,"viewCount":2076},{"author":"王练","body":"在微软 Build 2018 开发者大会上，.NET 团队发布了 .NET Core 的下一个主要版本 3.0 的规划蓝图。.Net Core 3 的首个预览版预计在今年晚些时候发布...","commentCount":23,"href":"https://www.oschina.net/news/95906/dotnet-core-3-new-features","id":95906,"pubDate":"2018-05-09 08:26:34","recommend":false,"title":".NET Core 3 新特性公布：支持 Windows 桌面应用","type":6,"viewCount":2383},{"author":"王练","body":"小猪从噩梦中惊醒，哭着对妈妈说：\u201c我梦见自己长大后成了水手，可是我不喜欢当水手。\u201d 猪妈妈安慰他道：\u201c不要怕孩子，梦都是反的啊。\u201d 果然，小...","commentCount":29,"href":"https://my.oschina.net/xxiaobian/blog/1809255","id":1809255,"pubDate":"2018-05-09 08:25:26","recommend":false,"title":"OSChina 周三乱弹 \u2014\u2014 姑娘不是我的心上人，请自重","type":3,"viewCount":2536},{"author":"王练","body":"PYPL 5 月最新 IDE 指数已发布，搜索最多的前三大 IDE 分别是 Visual Studio、Eclipse 和 Android Studio 。其中，Visual Studio 和 Eclipse 的指...","commentCount":25,"href":"https://www.oschina.net/news/95904/pypl-may-top-ide-index","id":95904,"pubDate":"2018-05-09 08:24:33","recommend":false,"title":"PYPL 5 月 IDE 指数榜：VS 和 Eclipse 争夺最强 IDE","type":6,"viewCount":1353},{"author":"王练","body":"去年年底曾有外媒报道，由于社区用户的强烈要求，微软正考虑添加 Python 作为官方的一种 Excel 脚本语言。不过在昨天的 Build 2018 开发者大会上，...","commentCount":12,"href":"https://www.oschina.net/news/95903/excel-support-javascript","id":95903,"pubDate":"2018-05-09 08:23:24","recommend":false,"title":"没有 Python，微软宣布 Excel 新增 JavaScript 支持","type":6,"viewCount":1496},{"author":"局长","body":"Google 2018 I/O 大会正在进行，Android P Beta 公测版目前已经发布。 下载地址 >>> https://developer.android.com/preview/download Android P ...","commentCount":4,"href":"https://www.oschina.net/news/95902/android-p-beta-released","id":95902,"pubDate":"2018-05-09 08:17:19","recommend":false,"title":"带来手势操作的 Android P beta 发布，Pixel 尝鲜","type":6,"viewCount":1477},{"author":"所以呢","body":"hi-nginx-1.4.8正式发布。 更新： nginx升级至1.14.0 升级hi-project脚本，创建工程更灵活方便 支持java 10 添加hi_lua_package_path 和 hi_lua_p...","commentCount":2,"href":"https://www.oschina.net/news/95901/hi-nginx-1-4-8-released","id":95901,"pubDate":"2018-05-09 08:11:10","recommend":false,"title":"hi-nginx-1.4.8 正式发布，新增一组命令","type":6,"viewCount":818},{"author":"局长","body":"Spring Framework 4.3.17 和 5.0.6 已发布，可从 repo.spring.io 和 Maven Central 获取更新。 官方表示，Spring Framework 4.3.17 包含了 15...","commentCount":5,"href":"https://www.oschina.net/news/95900/spring-framework-4-3-17-and-5-0-6-released","id":95900,"pubDate":"2018-05-09 08:04:04","recommend":false,"title":"Spring Framework 4.3.17 和 5.0.6 带来 Bug 修复和改进","type":6,"viewCount":973}]
         * nextPageToken : DBA816934CD0AA59
         * prevPageToken : 0997C855C600E421
         * requestCount : 20
         * responseCount : 20
         * totalResults : 88186
         */

        private String nextPageToken;
        private String prevPageToken;
        private int requestCount;
        private int responseCount;
        private int totalResults;
        private List<ItemsBean> items;

        public String getNextPageToken() {
            return nextPageToken;
        }

        public void setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
        }

        public String getPrevPageToken() {
            return prevPageToken;
        }

        public void setPrevPageToken(String prevPageToken) {
            this.prevPageToken = prevPageToken;
        }

        public int getRequestCount() {
            return requestCount;
        }

        public void setRequestCount(int requestCount) {
            this.requestCount = requestCount;
        }

        public int getResponseCount() {
            return responseCount;
        }

        public void setResponseCount(int responseCount) {
            this.responseCount = responseCount;
        }

        public int getTotalResults() {
            return totalResults;
        }

        public void setTotalResults(int totalResults) {
            this.totalResults = totalResults;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            /**
             * author : 淡漠悠然
             * body : jemalloc 5.1.0 已发布，jemalloc 是一个通用的 malloc（3）实现，它强调了分段回避和可伸缩并发支持。jemalloc 在 2005 年首次作为 FreeBSD libc...
             * commentCount : 1
             * href : https://www.oschina.net/news/95919/jemalloc-5-1-0-released
             * id : 95919
             * pubDate : 2018-05-09 13:36:16
             * recommend : true
             * title : jemalloc 5.1.0 发布，内存分配管理
             * type : 6
             * viewCount : 206
             */

            private String author;
            private String body;
            private int commentCount;
            private String href;
            private int id;
            private String pubDate;
            private boolean recommend;
            private String title;
            private int type;
            private int viewCount;

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public String getBody() {
                return body;
            }

            public void setBody(String body) {
                this.body = body;
            }

            public int getCommentCount() {
                return commentCount;
            }

            public void setCommentCount(int commentCount) {
                this.commentCount = commentCount;
            }

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getPubDate() {
                return pubDate;
            }

            public void setPubDate(String pubDate) {
                this.pubDate = pubDate;
            }

            public boolean isRecommend() {
                return recommend;
            }

            public void setRecommend(boolean recommend) {
                this.recommend = recommend;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getViewCount() {
                return viewCount;
            }

            public void setViewCount(int viewCount) {
                this.viewCount = viewCount;
            }
        }
    }
}
