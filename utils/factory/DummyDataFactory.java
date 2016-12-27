package com.mimo.indiemoa.classes.utils.factory;

import com.mimo.indiemoa.model.author.AuthorModel;
import com.mimo.indiemoa.model.component.DibsMemberModel;
import com.mimo.indiemoa.model.component.DibsMembersModel;
import com.mimo.indiemoa.model.main.CategoryModel;
import com.mimo.indiemoa.model.main.KeywordModel;
import com.mimo.indiemoa.model.main.NoticeMessageModel;
import com.mimo.indiemoa.model.main.NotificationModel;
import com.mimo.indiemoa.model.main.PopularModel;
import com.mimo.indiemoa.model.main.RecommendModel;
import com.mimo.indiemoa.model.order.OrderDeliveryDateWrapModel;
import com.mimo.indiemoa.model.order.OrderDeliveryModel;
import com.mimo.indiemoa.model.order.OrderItemModel;
import com.mimo.indiemoa.model.order.OrderModel;
import com.mimo.indiemoa.model.product.DeliveryChargeModel;
import com.mimo.indiemoa.model.product.KindModel;
import com.mimo.indiemoa.model.product.PostScriptModel;
import com.mimo.indiemoa.model.product.PostScriptsModel;
import com.mimo.indiemoa.model.product.ProductModel;
import com.mimo.indiemoa.model.profile.DeliveryAddressModel;
import com.mimo.indiemoa.model.profile.MemberModel;
import com.mimo.indiemoa.model.profile.RefundAccountModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Cro on 2016-09-19.
 */
public class DummyDataFactory {

    //region Singleton
    private DummyDataFactory() {
    }

    private static class Singleton {
        private static final DummyDataFactory instance = new DummyDataFactory();
    }

    public static DummyDataFactory getInstance() {
        return Singleton.instance;
    }
    //endregion

    public ArrayList<RecommendModel> getRecommendDummyData() {
        ArrayList<RecommendModel> model = new ArrayList<>();
        model.add(new RecommendModel(1, 1, "http://goo.gl/gEgYUd", "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "테스트타이틀입니다1", "10,000,000 원", RecommendModel.ModelType.Recommend));
        model.add(new RecommendModel(1, 1, "http://www.hanafn.com/kor/img/csr/img_financialaim.jpg", "http://goo.gl/gEgYUd", "테스트타이틀입니다2", "10,000,000 원", RecommendModel.ModelType.Recommend));
        model.add(new RecommendModel(1, 1, "http://www.hanafn.com/kor/img/csr/img_financialaim.jpg", "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "테스트타이틀입니다3", "10,000,000 원", RecommendModel.ModelType.Recommend));
        model.add(new RecommendModel(1, 1, "http://www.hanafn.com/kor/img/csr/img_financialaim.jpg", "http://goo.gl/gEgYUd", "테스트타이틀입니다4", "10,000,000 원", RecommendModel.ModelType.Recommend));
        model.add(new RecommendModel(1, 1, "http://www.hanafn.com/kor/img/csr/img_financialaim.jpg", "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "테스트타이틀입니다5", "10,000,000 원", RecommendModel.ModelType.Recommend));
        model.add(new RecommendModel(1, 1, "http://www.hanafn.com/kor/img/csr/img_financialaim.jpg", "http://goo.gl/gEgYUd", "테스트타이틀입니다6", "10,000,000 원", RecommendModel.ModelType.Recommend));
        return model;
    }

    public ArrayList<RecommendModel> getPreOrderDummyData() {
        ArrayList<RecommendModel> model = new ArrayList<>();
        model.add(new RecommendModel(2, 1, "http://goo.gl/gEgYUd", "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "테스트타이틀입니다1", "목표 금액 : 10,000,000 원 / 남은 기간 : 30일", RecommendModel.ModelType.PreOrder));
        model.add(new RecommendModel(2, 1, "http://www.hanafn.com/kor/img/csr/img_financialaim.jpg", "http://goo.gl/gEgYUd", "테스트타이틀입니다2", "목표 금액 : 10,000,000 원 / 남은 기간 : 30일", RecommendModel.ModelType.PreOrder));
        model.add(new RecommendModel(2, 1, "http://www.hanafn.com/kor/img/csr/img_financialaim.jpg", "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "테스트타이틀입니다3", "목표 금액 : 10,000,000 원 / 남은 기간 : 30일", RecommendModel.ModelType.PreOrder));
        model.add(new RecommendModel(2, 1, "http://www.hanafn.com/kor/img/csr/img_financialaim.jpg", "http://goo.gl/gEgYUd", "테스트타이틀입니다4", "목표 금액 : 10,000,000 원 / 남은 기간 : 30일", RecommendModel.ModelType.PreOrder));
        model.add(new RecommendModel(2, 1, "http://www.hanafn.com/kor/img/csr/img_financialaim.jpg", "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "테스트타이틀입니다5", "목표 금액 : 10,000,000 원 / 남은 기간 : 30일", RecommendModel.ModelType.PreOrder));
        model.add(new RecommendModel(2, 1, "http://www.hanafn.com/kor/img/csr/img_financialaim.jpg", "http://goo.gl/gEgYUd", "테스트타이틀입니다6", "목표 금액 : 10,000,000 원 / 남은 기간 : 30일", RecommendModel.ModelType.PreOrder));
        return model;
    }


    public ArrayList<PopularModel> getPopularDummyData() {
        ArrayList<PopularModel> model = new ArrayList<>();
        model.add(new PopularModel(1, 1, "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "Handmade 파우치", "캔버스 소재로 튼튼한 핸드메이드 파우치", "http://goo.gl/gEgYUd", "제이준", PopularModel.PreOrderState.PreOrder));
        model.add(new PopularModel(1, 1, "http://goo.gl/gEgYUd", "디퓨저", "캔버스 소재로 튼튼한 핸드메이드 파우치", "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "마이 MY", PopularModel.PreOrderState.None));
        model.add(new PopularModel(1, 1, "http://goo.gl/gEgYUd", "디퓨저", "캔버스 소재로 튼튼한 핸드메이드 파우치", "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "EVE", PopularModel.PreOrderState.Achieve));
        model.add(new PopularModel(1, 1, "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "악세서리", "캔버스 소재로 튼튼한 핸드메이드 파우치", "http://goo.gl/gEgYUd", "제이준", PopularModel.PreOrderState.End));

        return model;
    }

    public MemberModel getMemberDummyData() {
        Date birthDate;
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            birthDate = format.parse("1991-02-04");
        } catch (Exception e) {
            birthDate = new Date();
        }

        ArrayList<DeliveryAddressModel> deliveryAddressModelArrayList = new ArrayList<>();
        deliveryAddressModelArrayList.add(new DeliveryAddressModel());
        deliveryAddressModelArrayList.add(new DeliveryAddressModel());
        deliveryAddressModelArrayList.add(new DeliveryAddressModel());


        RefundAccountModel refundAccountModel = new RefundAccountModel("신혜진", "Indiemoa", "123-456-7890");

        return new MemberModel(1, "Email", "", "tls0109nmwls@naver.com", "http://www.hanafn.com/kor/img/csr/img_financialaim.jpg",
                "신혜진", birthDate, 'f', "010-1234-1234",
                refundAccountModel, deliveryAddressModelArrayList, new ArrayList<Integer>(), new ArrayList<Integer>(), new ArrayList<Integer>());
    }


    public NotificationModel[] getNotificationDummyData() {
        return new NotificationModel[]{
                new NotificationModel("모기가 싫어하는 천연 향으로 올 여름 모기 안녕~", "테스트"),
                new NotificationModel("<font color=#19a92a><strong> [구매팁] </strong></font>파라핀 캔들", "테스트"),
                new NotificationModel("불편한 점을 알려주세요.", "테스트"),
                new NotificationModel("<font color=#19a92a><strong> [진행중] </strong></font>카카오톡 친구 추가하고 할인쿠폰 받아가세요.",
                        "카카오톡 친구로 '아이디어스닷미'를 추가하면 깜짝 쿠폰을 드려요~ 지금 바로 추가해보세요!<br/><br/>아래 URL을 누르면 친구추가 페이지로 이동합니다!<br/><br/>또는 카카오톡에서 '아이디어스닷미'를 검색해서 추가해 주세요~<br/><br/><a href='http://www.google.com'>구글 테스트 링크</a>")
        };
    }

    public ArrayList<CategoryModel> getCategoryDummyData() {
        ArrayList<CategoryModel> array = new ArrayList<>();
        array.add(new CategoryModel("http://cfile27.uf.tistory.com/image/152B72474DD6202002FE60", "의류", "티셔츠, 자켓, 후드집업 ..."));
        array.add(new CategoryModel("http://cfile5.uf.tistory.com/image/216E7B48528DCCF10AF78A", "생활용품", "타올, 머그컵, 다키마쿠라 ..."));
        array.add(new CategoryModel("http://cfile27.uf.tistory.com/image/2771BD4E54C887C30B7315", "패션소품", "도트백, 지갑, 넥타이 ..."));
        array.add(new CategoryModel("http://www.felthouse.co.kr/shopimages/feltdesign/017003000024.jpg", "악세사리", "이어캡, 열쇠고리, 목걸이 ..."));
        array.add(new CategoryModel("http://cfile25.uf.tistory.com/image/13495A414EEF01772CE878", "도서", "동인지, 창작소설 ..."));
        array.add(new CategoryModel("https://s-media-cache-ak0.pinimg.com/236x/59/6c/8c/596c8c1afabbc5ab46ccee4cb3302c3a.jpg", "일러스트", "창작 일러스트"));
        array.add(new CategoryModel("http://segaji.com/shop/data/goods/1339390803l0.jpg", "태피스트리", "등신대, 캔버스아트 ..."));
        array.add(new CategoryModel("http://image.auction.co.kr/itemimage/d3/5b/87/d35b87865.jpg", "팬시", "마우스패드, 카드슬리브 ..."));

        return array;
    }

    public AuthorModel[] getDibsAuthorDummyData() {
        return new AuthorModel[]{
                new AuthorModel(1, "MOA", 3.5f, "이태원에서 유니크한 디저트와 제품을 만들고 있습니다.", "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "http://www.hanafn.com/kor/img/csr/img_financialaim.jpg", null, null, null),
                new AuthorModel(1, "데코", 3.5f, "데코쟁이/\n남들과 다르다는것? 작은것에서...", "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "http://www.hanafn.com/kor/img/csr/img_financialaim.jpg", null, null, null),
                new AuthorModel(1, "EVE", 3.5f, "EVE의 향기 / 천연 수제 비누.", "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "http://www.hanafn.com/kor/img/csr/img_financialaim.jpg", null, null, null),
        };
    }

    public ArrayList<KeywordModel> getPopularKeywordDummyData() {
        ArrayList<KeywordModel> model = new ArrayList<>();
        model.add(new KeywordModel("과일식초", 20));
        model.add(new KeywordModel("수제비누", 20));
        model.add(new KeywordModel("석고방향제", 20));
        model.add(new KeywordModel("추석", 20));
        model.add(new KeywordModel("커플", 20));
        model.add(new KeywordModel("기념", 20));
        model.add(new KeywordModel("폰케이스", 20));
        model.add(new KeywordModel("반지", 20));
        model.add(new KeywordModel("팔찌", 20));
        model.add(new KeywordModel("귀걸이", 20));
        model.add(new KeywordModel("목걸이", 20));
        model.add(new KeywordModel("시계", 20));
        model.add(new KeywordModel("방향", 20));
        model.add(new KeywordModel("단독할인", 20));
        model.add(new KeywordModel("이벤트", 20));
        model.add(new KeywordModel("반", 20));
        model.add(new KeywordModel("추석선물", 20));
        model.add(new KeywordModel("명절", 20));
        model.add(new KeywordModel("무드", 20));
        model.add(new KeywordModel("지갑", 20));


        return model;
    }

    public ProductModel getProductPreOrderDummyData() {
        return new ProductModel(
                2, ProductModel.ProductType.PreOrder, "8월할인♥파인애플식초가\n히트다히트!",
                new ArrayListDummyMaker<String>().make("http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", 7).bulid(),
                17000,
                "많은 고객님들의 성원 덕분에<br/>보틀 이벤트는 종료되었습니다.<br/><br/>《 8월 이벤트 》<br/>나름대로 예쁜 무늬를내어보려고<br/>상상하며 뚝딱뚝딱 즐겁게 만들었지만<br/>막상 비누를 컷팅해보니 상상속에서만<br/>예뻣던 것 같아<br/>아쉬웠던 비누입니다.<br/><br/>-<br/><br/>아래 주성분을 보시고,<br/>사용 전 특정 알러지 반응 성분이 있는지<br/>확인 후 사용해 주세요.",
                "주문시 제작",
                new DeliveryChargeModel(3000, 3000, 200000, 4, "샘들기름\n주문 후 바로 착유하여 가장 신선한 기름을 보내드립니다.\n\n생호박씨기름(수입산)\n주문 후 바로 착유하여 가장 신선한 기름을 보내드립니다.\n\n생호박씨기름(국내산 친환경 토종맷돌호박)\n\n국내산 호박씨 유통량이 적은 관계로 주문 후 배송까지 7~10일 소요됩니다."), "제품 개봉 전 교환/환불 가능",
                1000000, 600000, 30, 32,

                // author dummy
                new AuthorModel(1, "MOA", 9.3f, "이태원에서 유니크한 디저트와 제품을\n만들고 있습니다.\n#라비앙블루:디퓨저...", "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4",
                        new DibsMembersModel(283, 50, 1, getDibsMembersDummyData("http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "멤버아이디", 50)),
                        new DibsMembersModel(283, 50, 1, getDibsMembersDummyData("http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "스폰서", 50)),
                        new ArrayListDummyMaker<AuthorModel.ProductInfo>().make(new AuthorModel.ProductInfo("http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", 1), 10).bulid()),

                288, new DibsMembersModel(283, 50, 1, getDibsMembersDummyData("http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "이유정", 50)),

                new ArrayListDummyMaker<PostScriptModel>().make(
                        new PostScriptModel("이유정", "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4",
                                new Date(System.currentTimeMillis()),
                                new ArrayListDummyMaker<String>().make("http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4").bulid(),
                                "색 고민하다가 계절 안타고 무난한 색으로 골랐어요~~~~", 6),
                        5).bulid(),
                new ArrayListDummyMaker<KindModel>().make(new KindModel("종류", 20000)).make(new KindModel("보틀", 15000)).bulid(),
                new ArrayListDummyMaker<String>().make("선물 포장").make("일반 포장").bulid()
        );
    }

    public ProductModel getProductDummyData() {
        return new ProductModel(
                1, ProductModel.ProductType.Order, "8월할인♥파인애플식초가\n히트다히트!",
                new ArrayListDummyMaker<String>().make("http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", 50).bulid(),
                17000,
                "많은 고객님들의 성원 덕분에<br/>보틀 이벤트는 종료되었습니다.<br/><br/>《 8월 이벤트 》<br/>나름대로 예쁜 무늬를내어보려고<br/>상상하며 뚝딱뚝딱 즐겁게 만들었지만<br/>막상 비누를 컷팅해보니 상상속에서만<br/>예뻣던 것 같아<br/>아쉬웠던 비누입니다.<br/><br/>-<br/><br/>아래 주성분을 보시고,<br/>사용 전 특정 알러지 반응 성분이 있는지<br/>확인 후 사용해 주세요.",
                "주문시 제작",
                new DeliveryChargeModel(3000, 3000, 30000, 4, "샘들기름\n주문 후 바로 착유하여 가장 신선한 기름을 보내드립니다.\n\n생호박씨기름(수입산)\n주문 후 바로 착유하여 가장 신선한 기름을 보내드립니다.\n\n생호박씨기름(국내산 친환경 토종맷돌호박)\n\n국내산 호박씨 유통량이 적은 관계로 주문 후 배송까지 7~10일 소요됩니다."), "제품 개봉 전 교환/환불 가능",
                1000000, 600000, 30, 32,

                // author dummy
                new AuthorModel(1, "MOA", 9.3f,
                        "이태원에서 유니크한 디저트와 제품을\n만들고 있습니다.\n#라비앙블루:디퓨저...",
                        "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4",
                        "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4",
                        new DibsMembersModel(283, 50, 1, getDibsMembersDummyData("http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "멤버아이디", 50)),
                        new DibsMembersModel(283, 50, 1, getDibsMembersDummyData("http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "스폰서", 50)),
                        new ArrayListDummyMaker<AuthorModel.ProductInfo>().make(new AuthorModel.ProductInfo("http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", 1), 10).bulid()),
                288,
                new DibsMembersModel(283, 50, 1, getDibsMembersDummyData("http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "이유정", 50)),
                new ArrayListDummyMaker<PostScriptModel>().
                        make(new PostScriptModel("이유정", "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4",
                                new Date(System.currentTimeMillis()),
                                new ArrayListDummyMaker<String>().make("http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", 2).bulid(),
                                "색 고민하다가 계절 안타고 무난한 색으로 골랐어요~~~~", 10), 2).
                        make(new PostScriptModel("MOA", "http://i1.daumcdn.net/thumb/C150x150/?fname=http://cfile2.uf.tistory.com/image/276A4A4D585379ED11FDB7",
                                new Date(System.currentTimeMillis()),
                                new ArrayListDummyMaker<String>().make("http://i1.daumcdn.net/thumb/C150x150/?fname=http://cfile24.uf.tistory.com/image/26415E50574FAB1B32B0AF").bulid(),
                                "색 고민하다가 계절 안타고 무난한 색으로 골랐어요~~~~", 3), 1).bulid(),
                new ArrayListDummyMaker<KindModel>().make(new KindModel("없음", 0)).make(new KindModel("보틀", 15000)).bulid(),
                new ArrayListDummyMaker<String>().make("선물 포장").make("일반 포장").bulid()
        );
    }

    public PostScriptsModel getPostScriptsDummyData() {
        return new PostScriptsModel(
                5, 10, 1, new ArrayListDummyMaker<PostScriptModel>().make(
                new PostScriptModel("이유정", "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4",
                        new Date(System.currentTimeMillis()),
                        new ArrayListDummyMaker<String>().make("http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", 2).bulid(),
                        "색 고민하다가 계절 안타고 무난한 색으로 골랐어요~~~~", 6)
                , 5).bulid()
        );
    }

    public ArrayList<DibsMemberModel> getDibsMembersDummyData(String Url, String Title, int num) {
        return new ArrayListDummyMaker<DibsMemberModel>().make(new DibsMemberModel(Url, Title), num).bulid();
    }

    public static class ArrayListDummyMaker<T> {
        private ArrayList<T> list = new ArrayList<>();
        public ArrayListDummyMaker<T> make(T item, int n) {

            for (int i = 0; i < n; i++) {
                list.add(item);
            }
            return this;
        }

        public ArrayListDummyMaker<T> make(T item) {
            list.add(item);
            return this;
        }

        public ArrayList<T> bulid() {
            return list;
        }
    }

    public ArrayList<NoticeMessageModel> getNoticeListModelDummyData() {
        ArrayList<NoticeMessageModel> arrayList = new ArrayList<>();
        arrayList.add(new NoticeMessageModel(1, "", "INDIEMOA", "[오늘 밤 12시까지만 깜짝할인!] 다이어트 중이라면 우린 꼭 만나야 해요!", new Date(System.currentTimeMillis())));
        arrayList.add(new NoticeMessageModel(1, "", "INDIEMOA", "[심쿵 무드등] 침대옆 이런거 하나 있으면 좋겠다 생각한 바로 그 등!", new Date(System.currentTimeMillis())));
        arrayList.add(new NoticeMessageModel(1, "", "INDIEMOA", "구매내역 있으면 카톡 이모티콘을 공짜로 준다는데요?", new Date(System.currentTimeMillis())));
        arrayList.add(new NoticeMessageModel(1, "", "INDIEMOA", "[입점할인] 벌써 난리난 망고카레!", new Date(System.currentTimeMillis())));
        arrayList.add(new NoticeMessageModel(1, "", "INDIEMOA", "[오늘 밤 12시까지만 깜짝할인!] 다이어트 중이라면 우린 꼭 만나야 해요!", new Date(System.currentTimeMillis())));
        arrayList.add(new NoticeMessageModel(1, "", "INDIEMOA", "[심쿵 무드등] 침대옆 이런거 하나 있으면 좋겠다 생각한 바로 그 등!", new Date(System.currentTimeMillis())));
        arrayList.add(new NoticeMessageModel(1, "", "INDIEMOA", "구매내역 있으면 카톡 이모티콘을 공짜로 준다는데요?", new Date(System.currentTimeMillis())));
        arrayList.add(new NoticeMessageModel(1, "", "INDIEMOA", "[입점할인] 벌써 난리난 망고카레!", new Date(System.currentTimeMillis())));

        return arrayList;
    }

    public ArrayList<OrderDeliveryDateWrapModel> getOrderDeliveryDummyDate() {
        SimpleDateFormat sdFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
        Date tempDate1;
        Date tempDate2;
        try {
            tempDate1 = sdFormat.parse("20160811");
            tempDate2 = sdFormat.parse("20160714");
        }catch (ParseException e) {
            return null;
        }

        ArrayList<OrderDeliveryDateWrapModel> arrayList = new ArrayList<>();
        ArrayList<OrderDeliveryModel> tempArray1 = new ArrayList<>();
        ArrayList<OrderItemModel> tempArray2 = new ArrayList<>();
        tempArray2.add(new OrderItemModel(new KindModel("종류 1", 29000), "포장없음", 2, "없음"));
        tempArray2.add(new OrderItemModel(new KindModel("종류 2", 24000), "포장없음", 2, "없음"));

        tempArray1.add(new OrderDeliveryModel(1, "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "모닝스푼", new OrderModel(1, "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "8월할인♥파인애플식초가 히트다히트!", tempArray2),
                OrderDeliveryModel.DeliveryState.Order, new DeliveryAddressModel("김재원", "010-6394-3713", "31090\n충청남도 천안시 서북구 오성9길 15(두정동, 행복한삼겹살)\n2층 202호"), "신용카드"));
        arrayList.add(new OrderDeliveryDateWrapModel(tempDate1, tempArray1));

        tempArray1 = new ArrayList<>();
        tempArray2 = new ArrayList<>();
        tempArray2.add(new OrderItemModel(new KindModel("종류 1", 29000), "포장없음", 2, "없음"));
        tempArray2.add(new OrderItemModel(new KindModel("종류 2", 24000), "포장없음", 2, "없음"));

        tempArray1.add(new OrderDeliveryModel(1, "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "바인즈", new OrderModel(1, "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "바인즈 차량용 석고방향제", tempArray2),
                OrderDeliveryModel.DeliveryState.Delivery, new DeliveryAddressModel("김재원", "010-6394-3713", "31090\n충청남도 천안시 서북구 오성9길 15(두정동, 행복한삼겹살)\n2층 202호"), "신용카드"));
        tempArray1.add(new OrderDeliveryModel(1, "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "바인즈", new OrderModel(1, "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "바인즈 차량용 석고방향제", tempArray2),
                OrderDeliveryModel.DeliveryState.Achieve, new DeliveryAddressModel("김재원", "010-6394-3713", "31090\n충청남도 천안시 서북구 오성9길 15(두정동, 행복한삼겹살)\n2층 202호"), "신용카드"));
        tempArray1.add(new OrderDeliveryModel(1, "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "바인즈", new OrderModel(1, "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "바인즈 차량용 석고방향제", tempArray2),
                OrderDeliveryModel.DeliveryState.Fail, new DeliveryAddressModel("김재원", "010-6394-3713", "31090\n충청남도 천안시 서북구 오성9길 15(두정동, 행복한삼겹살)\n2층 202호"), "신용카드"));
        tempArray1.add(new OrderDeliveryModel(1, "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "바인즈", new OrderModel(1, "http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "바인즈 차량용 석고방향제", tempArray2),
                OrderDeliveryModel.DeliveryState.PreOrder, new DeliveryAddressModel("김재원", "010-6394-3713", "31090\n충청남도 천안시 서북구 오성9길 15(두정동, 행복한삼겹살)\n2층 202호"), "신용카드"));
        arrayList.add(new OrderDeliveryDateWrapModel(tempDate2, tempArray1));

        return arrayList;
    }
}
