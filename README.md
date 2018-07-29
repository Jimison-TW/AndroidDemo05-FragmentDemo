# AndroidDemo05-FragmentDemo

![image](https://github.com/Jimison-TW/AndroidDemo05-FragmentDemo/blob/master/Snap18.jpg?raw=true)

## 開發版本
Andorid 3.1.2 </br>
SdkVersion 27 </br>
minSdkVersion 15 </br>
targetSdkVersion 27 </br>

## 學習重點
1. 在一個Activity中透過fragment將兩個子畫面加進來
2. 學習兩個畫面的內容如何互相傳值
3. 了解Fragment的生命週期

## 如何實作Fragment
1. 在資料夾用New新增一個Fragment檔案，他就如同Activity一班有自己的layout，可以加入自己的設定
2. Fragment也具有自己的生命週期，可以在各個階段執行不同的指令</br>
![image](https://developer.android.com/images/fragment_lifecycle.png?hl=zh-tw)
3. Fragment可以透過getActivity()方法取得Fragment依附的Activity，而Activity是一个Context类型的对象，這樣即可傳值或透過findViewById取得其他元件。
4. 透過上面的方法很容易會有null的狀況而報錯，所以一班都是透過以下方法來溝通Fragment
* MyApplication是所有Fragment依附的Activity主體
* 写一个如下的BaseFragment类：所有的Fragment都继承这个BaseFragment,直接通过getContext()方法即可得到Context对象，当然实例化Dialog等需要依附于Activity的对象时，还是老老实实的getActivity()吧
```java=
public class BaseFragment extends Fragment{
    private Activity activity;

    public Context getContext(){
        if(activity == null){
            return MyApplication.getInstance();
        }
        return activity;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        activity = getActivity();
    }
}
```
