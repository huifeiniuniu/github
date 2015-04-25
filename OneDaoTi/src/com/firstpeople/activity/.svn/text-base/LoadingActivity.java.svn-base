package com.firstpeople.activity;

import com.firstpeople.R;
import com.firstpeople.utils.Common;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Gravity;
import android.widget.Toast;

public class LoadingActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.act_loading);
		// 判断SD卡是否存在
//		if (!android.os.Environment.getExternalStorageState().equals(
//				android.os.Environment.MEDIA_MOUNTED)) {
//			Common.showMessage(LoadingActivity.this, "未发现可用SD卡，软件将无法启动！\n请检查后，再尝试运行！",
//					Toast.LENGTH_LONG, R.drawable.error, Gravity.BOTTOM);
//			this.finish();
//		} else {
			// 新建线程
			new Thread() {
				@Override
				public void run() {
					// 向handler发消息
					handler.sendEmptyMessageDelayed(0, 1000);
				}
			}.start();
//		}
	}

	/**
	 * 用Handler来更新UI
	 */
 	private Handler handler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			ShowMainActivity() ;
		}
	};

	protected void ShowMainActivity() {
		this.finish();
		Intent intent = new Intent();
		intent.setClass(LoadingActivity.this, HomeActivity.class);
		startActivity(intent);
	}
}
