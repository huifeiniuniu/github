package com.firstpeople.view;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.firstpeople.R;
import com.firstpeople.activity.CollectActivity;
import com.firstpeople.activity.DownloadActivity;
import com.firstpeople.activity.MyActivity;
import com.firstpeople.activity.OldExamActivity;
import com.firstpeople.activity.PaperActivity;
import com.firstpeople.activity.QuickActivity;
import com.firstpeople.activity.SearchActivity;
import com.firstpeople.activity.SetUpActivity;
import com.firstpeople.activity.SmartActivity;
import com.firstpeople.activity.SpecialActivity;
import com.firstpeople.activity.SubjectChoiceActivity;
import com.firstpeople.anim.UgcAnimations;


/**
 * 菜单首页类
 * 
 * 
 */
public class Home implements OnItemClickListener,OnItemSelectedListener{
	private Context mContext;
	private Activity mActivity;
	private View mHome;

	private Button mMenu;
	private LinearLayout mTopLayout;
	private TextView mTopText;
	private Button mRefresh;

	private View mUgcView;
	private RelativeLayout mUgcLayout;
	private ImageView mUgc;
	private ImageView mUgcBg;
	private ImageView mUgcVoice;
	private ImageView mUgcPhoto;
	private ImageView mUgcRecord;
	private ImageView mUgcLbs;
	private GridView mGridView;

	/**
	 * 判断当前的path菜单是否已经显示
	 */
	private boolean mUgcIsShowing = false;

	public Home(Context context, Activity activity) {
		mContext = context;
		mActivity = activity;
		mHome = LayoutInflater.from(context).inflate(R.layout.act_home, null);
		findViewById();
		setListener();
		init();
	}

	private void findViewById() {
		mMenu = (Button) mHome.findViewById(R.id.home_menu);
		mTopLayout = (LinearLayout) mHome.findViewById(R.id.home_top_layout);
		mTopText = (TextView) mHome.findViewById(R.id.home_top_text);
		mRefresh = (Button) mHome.findViewById(R.id.home_refresh);
		mUgcView = (View) mHome.findViewById(R.id.home_ugc);
		mUgcLayout = (RelativeLayout) mUgcView.findViewById(R.id.ugc_layout);
		mUgc = (ImageView) mUgcView.findViewById(R.id.ugc);
		mUgcBg = (ImageView) mUgcView.findViewById(R.id.ugc_bg);
		mUgcVoice = (ImageView) mUgcView.findViewById(R.id.ugc_voice);
		mUgcPhoto = (ImageView) mUgcView.findViewById(R.id.ugc_photo);
		mUgcRecord = (ImageView) mUgcView.findViewById(R.id.ugc_record);
		mUgcLbs = (ImageView) mUgcView.findViewById(R.id.ugc_lbs);
		mTopText.setText("一道题");
		mGridView = (GridView) mHome.findViewById(R.id.home_gv);
		Init();
	}

	
	public void Init() {
		List<Map<String, Object>> items = new ArrayList<Map<String, Object>>();

		Map<String, Object> item = new HashMap<String, Object>();
		item.put("imageItem", R.drawable.icon_home_quick);
		item.put("textItem", mContext.getString(R.string.home_quick));
		items.add(item);
		item = null;

		item = new HashMap<String, Object>();
		item.put("imageItem", R.drawable.icon_home_smart);
		item.put("textItem", mContext.getString(R.string.home_smart));
		items.add(item);
		item = null;

		item = new HashMap<String, Object>();
		item.put("imageItem", R.drawable.icon_home_special);
		item.put("textItem", mContext.getString(R.string.home_special));
		items.add(item);
		item = null;

		item = new HashMap<String, Object>();
		item.put("imageItem", R.drawable.icon_home_oldexam);
		item.put("textItem", mContext.getString(R.string.home_oldexam));
		items.add(item);
		item = null;

		item = new HashMap<String, Object>();
		item.put("imageItem", R.drawable.icon_home_paper);
		item.put("textItem", mContext.getString(R.string.home_paper));
		items.add(item);
		item = null;

		item = new HashMap<String, Object>();
		item.put("imageItem", R.drawable.icon_home_collect);
		item.put("textItem", mContext.getString(R.string.home_collect));
		items.add(item);
		item = null;

		SimpleAdapter adapter = new SimpleAdapter(mContext, items,
				R.layout.gridview_main,
				new String[] { "imageItem", "textItem" }, new int[] {
						R.id.gridview_menu_item_image,
						R.id.gridview_menu_item_text });

		mGridView.setAdapter(adapter);
		mGridView.setOnItemClickListener(this);
		mGridView.setOnItemSelectedListener(this);
	}

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub

	}

	/**
	 * @author wangxiaofei Description :点击图标，进入相应的功能下
	 */

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int position,
			long arg3) {
		// TODO Auto-generated method stub
		switch (position) {
		case 0: {
			mContext.startActivity(new Intent(mActivity,
					QuickActivity.class));

		}break;
		case 1: {
			mContext.startActivity(new Intent(mActivity,
					SmartActivity.class));

		}break;
		case 2: {
			mContext.startActivity(new Intent(mActivity,
					SpecialActivity.class));

		}break;
		case 3: {
			mContext.startActivity(new Intent(mActivity,
					OldExamActivity.class));

		}break;
		case 4: {
			mContext.startActivity(new Intent(mActivity,
					PaperActivity.class));

		}break;
		case 5: {
			mContext.startActivity(new Intent(mActivity,
					CollectActivity.class));

		}break;
		default:
			break;
		}

	}
	
	private void setListener() {
		mMenu.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				mContext.startActivity(new Intent(mActivity,
						SubjectChoiceActivity.class));
			}
		});
		mRefresh.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// 暂时不做任何操作
				mContext.startActivity(new Intent(mActivity,
						SearchActivity.class));
			}
		});
		// Path监听
		mUgcView.setOnTouchListener(new OnTouchListener() {

			public boolean onTouch(View v, MotionEvent event) {
				// 判断是否已经显示,显示则关闭并隐藏
				if (mUgcIsShowing) {
					mUgcIsShowing = false;
					UgcAnimations.startCloseAnimation(mUgcLayout, mUgcBg, mUgc,
							500);
					return true;
				}
				return false;
			}
		});
		// Path监听
		mUgc.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// 判断是否显示,已经显示则隐藏,否则则显示
				mUgcIsShowing = !mUgcIsShowing;
				if (mUgcIsShowing) {
					UgcAnimations.startOpenAnimation(mUgcLayout, mUgcBg, mUgc,
							500);
				} else {
					UgcAnimations.startCloseAnimation(mUgcLayout, mUgcBg, mUgc,
							500);
				}
			}
		});
		// Path 语音按钮监听
		mUgcVoice.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				Animation anim = UgcAnimations.clickAnimation(500);
				anim.setAnimationListener(new AnimationListener() {

					public void onAnimationStart(Animation animation) {

					}

					public void onAnimationRepeat(Animation animation) {

					}

					public void onAnimationEnd(Animation animation) {

						closeUgc();
					}
				});
				mUgcVoice.startAnimation(anim);
			}
		});
		// Path 拍照按钮监听
		mUgcPhoto.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				Animation anim = UgcAnimations.clickAnimation(500);
				anim.setAnimationListener(new AnimationListener() {

					public void onAnimationStart(Animation animation) {

					}

					public void onAnimationRepeat(Animation animation) {

					}

					public void onAnimationEnd(Animation animation) {
						mContext.startActivity(new Intent(mActivity,
								DownloadActivity.class));
						closeUgc();
					}
				});
				mUgcPhoto.startAnimation(anim);
			}
		});
		// Path 记录按钮监听
		mUgcRecord.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				Animation anim = UgcAnimations.clickAnimation(500);
				anim.setAnimationListener(new AnimationListener() {

					public void onAnimationStart(Animation animation) {

					}

					public void onAnimationRepeat(Animation animation) {

					}

					public void onAnimationEnd(Animation animation) {
						mContext.startActivity(new Intent(mActivity,
								MyActivity.class));
						closeUgc();
					}
				});
				mUgcRecord.startAnimation(anim);
			}
		});
		// Path 签到按钮监听
		mUgcLbs.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				Animation anim = UgcAnimations.clickAnimation(500);
				anim.setAnimationListener(new AnimationListener() {

					public void onAnimationStart(Animation animation) {

					}

					public void onAnimationRepeat(Animation animation) {

					}

					public void onAnimationEnd(Animation animation) {
						mContext.startActivity(new Intent(mActivity,
								SetUpActivity.class));
						closeUgc();
					}
				});
				mUgcLbs.startAnimation(anim);
			}
		});
	}

	private void init() {
		// 获取首页数据
	}


	/**
	 * 获取Path菜单显示状态
	 * 
	 * @return 显示状态
	 */
	public boolean getUgcIsShowing() {
		return mUgcIsShowing;
	}

	/**
	 * 关闭Path菜单
	 */
	public void closeUgc() {
		mUgcIsShowing = false;
		UgcAnimations.startCloseAnimation(mUgcLayout, mUgcBg, mUgc, 500);
	}

	/**
	 * 显示Path菜单
	 */
	public void showUgc() {
		if (mUgcView != null) {
			mUgcView.setVisibility(View.VISIBLE);
		}

	}

	/**
	 * 关闭Path菜单
	 */
	public void dismissUgc() {
		if (mUgcView != null) {
			mUgcView.setVisibility(View.GONE);
		}
	}

	public View getView() {
		return mHome;
	}

}
