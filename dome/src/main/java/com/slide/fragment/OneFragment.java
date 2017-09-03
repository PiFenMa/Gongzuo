package com.slide.fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.slide.main.DuiwuActivity;
import com.socks.library.KLog;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * @author fml
 * created at 2016/6/20 13:41
 * description：LazyFragment使用懒加载方法，避免切换fragment的时候造成其它fragment onstart方法运行,lazyLoad方法代替onstart方法
 */
public class OneFragment extends LazyFragment {
    // 标志fragment是否初始化完成
    private boolean isPrepared;
    private View view;
    @InjectView(R.id.bt_fragment_one_duiwu)
    Button bt_duiwu;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        if(view == null){
            view = inflater.inflate(R.layout.fragment_one , container , false);
            ButterKnife.inject(this, view);
            KLog.e("TAG" , "oneFragment--onCreateView");
            isPrepared = true;
            lazyLoad();
        }
        return view;
    }


    @Override
    protected void lazyLoad() {
        if(!isPrepared || !isVisible) {
            return;
        }
        KLog.e("TAG" , "oneFragment--lazyLoad");
    }
    @OnClick(R.id.bt_fragment_one_duiwu)
    public void duiwu(){
        Intent intent = new Intent(getActivity(), DuiwuActivity.class);
        startActivity(intent);
    }

}
