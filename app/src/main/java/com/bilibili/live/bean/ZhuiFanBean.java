package com.bilibili.live.bean;

import java.util.List;

/**
 * Created by 潘鹏程 on 2017/3/25.
 * 微信:13212223597
 * QQ:591738374
 * 作用:
 */

public class ZhuiFanBean {


    /**
     * code : 0
     * message : success
     * result : {"ad":{"body":[],"head":[{"id":0,"img":"http://i0.hdslb.com/bfs/bangumi/a093348aea6f7def3ef45a68f6272270e5f0afb1.jpg","link":"http://www.bilibili.com/blackboard/activity-S1aPZanjx.html","pub_time":"2017-03-24 18:58:00","title":"4鏈堟柊鐣�"},{"id":0,"img":"http://i0.hdslb.com/bfs/bangumi/838fb721044c4031b80e2ece6a709b753f8fc161.jpg","link":"http://bangumi.bilibili.com/anime/5778","pub_time":"2017-03-24 22:30:00","title":"椋庡"},{"id":0,"img":"http://i0.hdslb.com/bfs/bangumi/2cc14d831d0a4d7972870e72c1b944fd7a296831.jpg","link":"http://bangumi.bilibili.com/anime/5774","pub_time":"2017-03-24 12:00:00","title":"娓呮亱 SEIREN"},{"id":0,"img":"http://i0.hdslb.com/bfs/bangumi/a368a33425cc0efb883366f9dc69a31a435a2246.jpg","link":"http://bangumi.bilibili.com/anime/2069","pub_time":"2017-03-24 00:00:00","title":"鍗佷簩鍥借"}]},"previous":{"list":[{"cover":"http://i0.hdslb.com/bfs/bangumi/2673ac643b48eb5bda64c960a2ca850fbebb839d.jpg","favourites":"1677933","is_finish":1,"last_time":1482262210,"newest_ep_index":"11","pub_time":1475607600,"season_id":5550,"season_status":2,"title":"澶忕洰鍙嬩汉甯� 浼�","watching_count":0},{"cover":"http://i0.hdslb.com/bfs/bangumi/b75c55d209d156c8631f5ceb21e5c52c834dbb60.jpg","favourites":"1335302","is_finish":1,"last_time":1483196409,"newest_ep_index":"1","pub_time":1483196400,"season_id":5747,"season_status":2,"title":"Fate/Grand Order 鈥怓irst Order鈥�","watching_count":0},{"cover":"http://i0.hdslb.com/bfs/bangumi/b3633d2e5cafa0d048f4beef63618c92cfac4c4c.jpg","favourites":"787427","is_finish":1,"last_time":1482465609,"newest_ep_index":"12","pub_time":1475812800,"season_id":5534,"season_status":2,"title":"鎴戝お鍙楁杩庝簡璇ユ\u20ac庝箞鍔�","watching_count":0}],"season":4,"year":2016},"serializing":[{"cover":"http://i0.hdslb.com/bfs/bangumi/dc99c5c10c3705fd5d0dbdbaf1ef1cf7e7595588.jpg","favourites":"23327","is_finish":0,"is_started":1,"last_time":1490407203,"newest_ep_index":"1","pub_time":1490407200,"season_id":6008,"season_status":2,"title":"姊︾帇鍥戒笌娌夌潯鐨�100鐜嬪瓙 鐭瘒鍔ㄧ敾","watching_count":458},{"badge":"浠樿垂鎶㈠厛","cover":"http://i0.hdslb.com/bfs/bangumi/2d86f338ec4c17d5c61a103a3de01a1b27ec184e.jpg","favourites":"877658","is_finish":0,"is_started":1,"last_time":1490407202,"newest_ep_index":"12","pub_time":1483718400,"season_id":5851,"season_status":7,"title":"鏂楃牬鑻嶇┕","watching_count":447},{"cover":"http://i0.hdslb.com/bfs/bangumi/e49ca84c459f3ceb86ec88aeeaaef4a7ebd1ca1a.jpg","favourites":"7094","is_finish":0,"is_started":1,"last_time":1490400002,"newest_ep_index":"50","pub_time":1459555200,"season_id":5615,"season_status":2,"title":"鏆栨殩鏃ヨ","watching_count":6},{"cover":"http://i0.hdslb.com/bfs/bangumi/2d0a4095bfee640db70569174b7b23642d641a28.jpg","favourites":"163977","is_finish":0,"is_started":1,"last_time":1490373000,"newest_ep_index":"12","pub_time":1483720200,"season_id":5777,"season_status":2,"title":"Schoolgirl Strikers","watching_count":159},{"cover":"http://i0.hdslb.com/bfs/bangumi/72ef3f2a86c96a8db9abf8c4b7f7fe3c2d17e27b.jpg","favourites":"687695","is_finish":1,"is_started":1,"last_time":1490365802,"newest_ep_index":"12","pub_time":1483711200,"season_id":5778,"season_status":2,"title":"椋庡","watching_count":1546},{"cover":"http://i0.hdslb.com/bfs/bangumi/8c7e18df9ca21fc8da6b5860b8f7d2ad1bbf4462.jpg","favourites":"4003","is_finish":0,"is_started":1,"last_time":1490347985,"newest_ep_index":"4","pub_time":1488470400,"season_id":5936,"season_status":2,"title":"鑼呭眿鐖风埛璁叉晠浜�","watching_count":4}]}
     */

    private int code;
    private String message;
    private ResultBean result;

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

    public static class ResultBean {
        /**
         * ad : {"body":[],"head":[{"id":0,"img":"http://i0.hdslb.com/bfs/bangumi/a093348aea6f7def3ef45a68f6272270e5f0afb1.jpg","link":"http://www.bilibili.com/blackboard/activity-S1aPZanjx.html","pub_time":"2017-03-24 18:58:00","title":"4鏈堟柊鐣�"},{"id":0,"img":"http://i0.hdslb.com/bfs/bangumi/838fb721044c4031b80e2ece6a709b753f8fc161.jpg","link":"http://bangumi.bilibili.com/anime/5778","pub_time":"2017-03-24 22:30:00","title":"椋庡"},{"id":0,"img":"http://i0.hdslb.com/bfs/bangumi/2cc14d831d0a4d7972870e72c1b944fd7a296831.jpg","link":"http://bangumi.bilibili.com/anime/5774","pub_time":"2017-03-24 12:00:00","title":"娓呮亱 SEIREN"},{"id":0,"img":"http://i0.hdslb.com/bfs/bangumi/a368a33425cc0efb883366f9dc69a31a435a2246.jpg","link":"http://bangumi.bilibili.com/anime/2069","pub_time":"2017-03-24 00:00:00","title":"鍗佷簩鍥借"}]}
         * previous : {"list":[{"cover":"http://i0.hdslb.com/bfs/bangumi/2673ac643b48eb5bda64c960a2ca850fbebb839d.jpg","favourites":"1677933","is_finish":1,"last_time":1482262210,"newest_ep_index":"11","pub_time":1475607600,"season_id":5550,"season_status":2,"title":"澶忕洰鍙嬩汉甯� 浼�","watching_count":0},{"cover":"http://i0.hdslb.com/bfs/bangumi/b75c55d209d156c8631f5ceb21e5c52c834dbb60.jpg","favourites":"1335302","is_finish":1,"last_time":1483196409,"newest_ep_index":"1","pub_time":1483196400,"season_id":5747,"season_status":2,"title":"Fate/Grand Order 鈥怓irst Order鈥�","watching_count":0},{"cover":"http://i0.hdslb.com/bfs/bangumi/b3633d2e5cafa0d048f4beef63618c92cfac4c4c.jpg","favourites":"787427","is_finish":1,"last_time":1482465609,"newest_ep_index":"12","pub_time":1475812800,"season_id":5534,"season_status":2,"title":"鎴戝お鍙楁杩庝簡璇ユ\u20ac庝箞鍔�","watching_count":0}],"season":4,"year":2016}
         * serializing : [{"cover":"http://i0.hdslb.com/bfs/bangumi/dc99c5c10c3705fd5d0dbdbaf1ef1cf7e7595588.jpg","favourites":"23327","is_finish":0,"is_started":1,"last_time":1490407203,"newest_ep_index":"1","pub_time":1490407200,"season_id":6008,"season_status":2,"title":"姊︾帇鍥戒笌娌夌潯鐨�100鐜嬪瓙 鐭瘒鍔ㄧ敾","watching_count":458},{"badge":"浠樿垂鎶㈠厛","cover":"http://i0.hdslb.com/bfs/bangumi/2d86f338ec4c17d5c61a103a3de01a1b27ec184e.jpg","favourites":"877658","is_finish":0,"is_started":1,"last_time":1490407202,"newest_ep_index":"12","pub_time":1483718400,"season_id":5851,"season_status":7,"title":"鏂楃牬鑻嶇┕","watching_count":447},{"cover":"http://i0.hdslb.com/bfs/bangumi/e49ca84c459f3ceb86ec88aeeaaef4a7ebd1ca1a.jpg","favourites":"7094","is_finish":0,"is_started":1,"last_time":1490400002,"newest_ep_index":"50","pub_time":1459555200,"season_id":5615,"season_status":2,"title":"鏆栨殩鏃ヨ","watching_count":6},{"cover":"http://i0.hdslb.com/bfs/bangumi/2d0a4095bfee640db70569174b7b23642d641a28.jpg","favourites":"163977","is_finish":0,"is_started":1,"last_time":1490373000,"newest_ep_index":"12","pub_time":1483720200,"season_id":5777,"season_status":2,"title":"Schoolgirl Strikers","watching_count":159},{"cover":"http://i0.hdslb.com/bfs/bangumi/72ef3f2a86c96a8db9abf8c4b7f7fe3c2d17e27b.jpg","favourites":"687695","is_finish":1,"is_started":1,"last_time":1490365802,"newest_ep_index":"12","pub_time":1483711200,"season_id":5778,"season_status":2,"title":"椋庡","watching_count":1546},{"cover":"http://i0.hdslb.com/bfs/bangumi/8c7e18df9ca21fc8da6b5860b8f7d2ad1bbf4462.jpg","favourites":"4003","is_finish":0,"is_started":1,"last_time":1490347985,"newest_ep_index":"4","pub_time":1488470400,"season_id":5936,"season_status":2,"title":"鑼呭眿鐖风埛璁叉晠浜�","watching_count":4}]
         */

        private AdBean ad;
        private PreviousBean previous;
        private List<SerializingBean> serializing;

        public AdBean getAd() {
            return ad;
        }

        public void setAd(AdBean ad) {
            this.ad = ad;
        }

        public PreviousBean getPrevious() {
            return previous;
        }

        public void setPrevious(PreviousBean previous) {
            this.previous = previous;
        }

        public List<SerializingBean> getSerializing() {
            return serializing;
        }

        public void setSerializing(List<SerializingBean> serializing) {
            this.serializing = serializing;
        }

        public static class AdBean {
            private List<?> body;
            private List<HeadBean> head;

            public List<?> getBody() {
                return body;
            }

            public void setBody(List<?> body) {
                this.body = body;
            }

            public List<HeadBean> getHead() {
                return head;
            }

            public void setHead(List<HeadBean> head) {
                this.head = head;
            }

            public static class HeadBean {
                /**
                 * id : 0
                 * img : http://i0.hdslb.com/bfs/bangumi/a093348aea6f7def3ef45a68f6272270e5f0afb1.jpg
                 * link : http://www.bilibili.com/blackboard/activity-S1aPZanjx.html
                 * pub_time : 2017-03-24 18:58:00
                 * title : 4鏈堟柊鐣�
                 */

                private int id;
                private String img;
                private String link;
                private String pub_time;
                private String title;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getImg() {
                    return img;
                }

                public void setImg(String img) {
                    this.img = img;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }

                public String getPub_time() {
                    return pub_time;
                }

                public void setPub_time(String pub_time) {
                    this.pub_time = pub_time;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }
            }
        }

        public static class PreviousBean {
            /**
             * list : [{"cover":"http://i0.hdslb.com/bfs/bangumi/2673ac643b48eb5bda64c960a2ca850fbebb839d.jpg","favourites":"1677933","is_finish":1,"last_time":1482262210,"newest_ep_index":"11","pub_time":1475607600,"season_id":5550,"season_status":2,"title":"澶忕洰鍙嬩汉甯� 浼�","watching_count":0},{"cover":"http://i0.hdslb.com/bfs/bangumi/b75c55d209d156c8631f5ceb21e5c52c834dbb60.jpg","favourites":"1335302","is_finish":1,"last_time":1483196409,"newest_ep_index":"1","pub_time":1483196400,"season_id":5747,"season_status":2,"title":"Fate/Grand Order 鈥怓irst Order鈥�","watching_count":0},{"cover":"http://i0.hdslb.com/bfs/bangumi/b3633d2e5cafa0d048f4beef63618c92cfac4c4c.jpg","favourites":"787427","is_finish":1,"last_time":1482465609,"newest_ep_index":"12","pub_time":1475812800,"season_id":5534,"season_status":2,"title":"鎴戝お鍙楁杩庝簡璇ユ\u20ac庝箞鍔�","watching_count":0}]
             * season : 4
             * year : 2016
             */

            private int season;
            private int year;
            private List<ListBean> list;

            public int getSeason() {
                return season;
            }

            public void setSeason(int season) {
                this.season = season;
            }

            public int getYear() {
                return year;
            }

            public void setYear(int year) {
                this.year = year;
            }

            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            public static class ListBean {
                /**
                 * cover : http://i0.hdslb.com/bfs/bangumi/2673ac643b48eb5bda64c960a2ca850fbebb839d.jpg
                 * favourites : 1677933
                 * is_finish : 1
                 * last_time : 1482262210
                 * newest_ep_index : 11
                 * pub_time : 1475607600
                 * season_id : 5550
                 * season_status : 2
                 * title : 澶忕洰鍙嬩汉甯� 浼�
                 * watching_count : 0
                 */

                private String cover;
                private String favourites;
                private int is_finish;
                private int last_time;
                private String newest_ep_index;
                private int pub_time;
                private int season_id;
                private int season_status;
                private String title;
                private int watching_count;

                public String getCover() {
                    return cover;
                }

                public void setCover(String cover) {
                    this.cover = cover;
                }

                public String getFavourites() {
                    return favourites;
                }

                public void setFavourites(String favourites) {
                    this.favourites = favourites;
                }

                public int getIs_finish() {
                    return is_finish;
                }

                public void setIs_finish(int is_finish) {
                    this.is_finish = is_finish;
                }

                public int getLast_time() {
                    return last_time;
                }

                public void setLast_time(int last_time) {
                    this.last_time = last_time;
                }

                public String getNewest_ep_index() {
                    return newest_ep_index;
                }

                public void setNewest_ep_index(String newest_ep_index) {
                    this.newest_ep_index = newest_ep_index;
                }

                public int getPub_time() {
                    return pub_time;
                }

                public void setPub_time(int pub_time) {
                    this.pub_time = pub_time;
                }

                public int getSeason_id() {
                    return season_id;
                }

                public void setSeason_id(int season_id) {
                    this.season_id = season_id;
                }

                public int getSeason_status() {
                    return season_status;
                }

                public void setSeason_status(int season_status) {
                    this.season_status = season_status;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getWatching_count() {
                    return watching_count;
                }

                public void setWatching_count(int watching_count) {
                    this.watching_count = watching_count;
                }
            }
        }

        public static class SerializingBean {
            /**
             * cover : http://i0.hdslb.com/bfs/bangumi/dc99c5c10c3705fd5d0dbdbaf1ef1cf7e7595588.jpg
             * favourites : 23327
             * is_finish : 0
             * is_started : 1
             * last_time : 1490407203
             * newest_ep_index : 1
             * pub_time : 1490407200
             * season_id : 6008
             * season_status : 2
             * title : 姊︾帇鍥戒笌娌夌潯鐨�100鐜嬪瓙 鐭瘒鍔ㄧ敾
             * watching_count : 458
             * badge : 浠樿垂鎶㈠厛
             */

            private String cover;
            private String favourites;
            private int is_finish;
            private int is_started;
            private int last_time;
            private String newest_ep_index;
            private int pub_time;
            private int season_id;
            private int season_status;
            private String title;
            private int watching_count;
            private String badge;

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public String getFavourites() {
                return favourites;
            }

            public void setFavourites(String favourites) {
                this.favourites = favourites;
            }

            public int getIs_finish() {
                return is_finish;
            }

            public void setIs_finish(int is_finish) {
                this.is_finish = is_finish;
            }

            public int getIs_started() {
                return is_started;
            }

            public void setIs_started(int is_started) {
                this.is_started = is_started;
            }

            public int getLast_time() {
                return last_time;
            }

            public void setLast_time(int last_time) {
                this.last_time = last_time;
            }

            public String getNewest_ep_index() {
                return newest_ep_index;
            }

            public void setNewest_ep_index(String newest_ep_index) {
                this.newest_ep_index = newest_ep_index;
            }

            public int getPub_time() {
                return pub_time;
            }

            public void setPub_time(int pub_time) {
                this.pub_time = pub_time;
            }

            public int getSeason_id() {
                return season_id;
            }

            public void setSeason_id(int season_id) {
                this.season_id = season_id;
            }

            public int getSeason_status() {
                return season_status;
            }

            public void setSeason_status(int season_status) {
                this.season_status = season_status;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getWatching_count() {
                return watching_count;
            }

            public void setWatching_count(int watching_count) {
                this.watching_count = watching_count;
            }

            public String getBadge() {
                return badge;
            }

            public void setBadge(String badge) {
                this.badge = badge;
            }
        }
    }
}
