package com.mimo.indiemoa.classes.utils.provider;

import com.squareup.otto.Bus;

/**
 * Created by mimoPC on 2016-12-21.
 * 해당 클래스는 Square사에 제작한 Otto라는 Event Bug 라이브러리 제공자이다.
 * 사용 이유 참고 http://gun0912.tistory.com/4
 * DataPool과 EventPool을 대체하기 위해서 개발중
 * 사용법
 * 등록 : onCreate함수에 'BusProvider.getInstance.register(this);'
 * 해제 : 'BusProvider.getInstance.unregister(this);' 원하는 시점에
 * 이벤트 발생시 수행할 함수생성법
 * "@Subscribe
 *  public void foo(PushEvent pe) {
 *      ...
 *  }" **PushEvent는 자신이 원하는 방법으로 생성 가능
 *  이벤트를 날려주는 방법
 *  'BusProvider.getInstance().post(new PushEvent(reults));'
 */
public class BusProvider {

    // region SingleTon
    private BusProvider() {

    }

    private static class SingleTon {
        private static final Bus _instance = new Bus();
    }

    public static Bus getInstance() {
        return SingleTon._instance;
    }
    // endregion
}
