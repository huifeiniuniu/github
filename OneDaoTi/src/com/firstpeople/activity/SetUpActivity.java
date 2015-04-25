package com.firstpeople.activity;

import com.firstpeople.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;


/**
 * 设置类
 * 
 * @author rendongwei
 * 
 */
public class SetUpActivity extends Activity {
	private Button mBack;
	private LinearLayout mExport;
	private LinearLayout mUpload;
	private LinearLayout mFeedBack;
	private LinearLayout mSetUp;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.act_setup);
		findViewById();
		setListener();
	}

	private void findViewById() {
		mBack = (Button) findViewById(R.id.setup_back);
		mExport = (LinearLayout) findViewById(R.id.setup_export);
		mUpload = (LinearLayout) findViewById(R.id.setup_upload);
		mFeedBack = (LinearLayout) findViewById(R.id.setup_feedback);
		mSetUp = (LinearLayout) findViewById(R.id.setup_setup);
	}

	private void setListener() {
		mBack.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// 关闭当前界面
				finish();
			}
		});
		mExport.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// 跳转到导入好友至手机通讯录类
			}
		});
		mUpload.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// 跳转到查看上传进度了类
			}
		});
		mFeedBack.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// 跳转到用户反馈类

			}
		});
		mSetUp.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// 跳转到设置类
			}
		});
	}
}
