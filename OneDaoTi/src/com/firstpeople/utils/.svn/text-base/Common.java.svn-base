package com.firstpeople.utils;

import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Common {

	/**
	 * 打开输入法
	 * 
	 * @param act
	 */
	public static void showInputMethod(final Activity act) {
		Handler mHandler = new Handler();
		mHandler.postDelayed(new Runnable() {
			@Override
			public void run() {
				InputMethodManager imm = (InputMethodManager) act
						.getSystemService(Context.INPUT_METHOD_SERVICE);
				imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
			}
		}, 500);
	}

	/**
	 * 关闭输入法
	 * 
	 * @param act
	 */
	public static void closeInputMethod(final Activity act) {
		Handler mHandler = new Handler();
		mHandler.postDelayed(new Runnable() {
			@Override
			public void run() {
				InputMethodManager imm = (InputMethodManager) act
						.getSystemService(Context.INPUT_METHOD_SERVICE);
				// if (imm.isActive()) { //无效
				imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
				// }
			}
		}, 500);
	}
 
	/**
	 * 界面灰色显示
	 * 
	 * @param act
	 */
	public static void setGray(Activity act) {
		WindowManager.LayoutParams lp = act.getWindow().getAttributes();
		lp.alpha = 0.3f;
		lp.dimAmount = 0.3f;
		act.getWindow().setAttributes(lp);
	}

	/**
	 * 界面正常显示
	 * 
	 * @param act
	 */
	public static void setNormal(Activity act) {
		WindowManager.LayoutParams lp = act.getWindow().getAttributes();
		lp.alpha = 1f;
		lp.dimAmount = 1f;
		act.getWindow().setAttributes(lp);
	}

	/**
	 * 显示提示消息
	 * 
	 * @param act
	 * @param text
	 * @param duration
	 * @param image
	 */
	public static void showMessage(Activity act, String text, int duration,
			int image) {
		showMessage(act, text, duration, image, Gravity.CENTER);
	}

	/**
	 * 显示提示消息
	 * 
	 * @param act
	 * @param text
	 * @param duration
	 * @param image
	 * @param gravity
	 */
	public static void showMessage(Activity act, String text, int duration,
			int image, int gravity) {
		Toast toast = Toast.makeText(act, "   " + text, duration);
		toast.setGravity(gravity, 0, 0);
		LinearLayout toastView = (LinearLayout) toast.getView();
		ImageView imageCodeProject = new ImageView(act);
		imageCodeProject.setImageResource(image);

		toastView.setOrientation(LinearLayout.HORIZONTAL);
		toastView.setGravity(Gravity.CENTER_VERTICAL);
		toastView.addView(imageCodeProject, 0);
		toast.show();
	}

	/**
	 * 获取传入日期的字符串，yyyy-MM-dd
	 * 
	 * @param cd
	 * @return
	 */
	public static String getDateSqlString(Calendar cd) {
		java.text.DateFormat ft = new java.text.SimpleDateFormat("yyyy-MM-dd");
		String formatTime = ft.format(cd.getTime());
		return formatTime;
	}

	/**
	 * 获取传入日期的字符串，yyyy-MM-dd 00:00:00
	 * 
	 * @param cd
	 * @return
	 */
	public static String getDateNoteString(Calendar cd) {
		java.text.DateFormat ft = new java.text.SimpleDateFormat(
				"yyyy-MM-dd 00:00:00");
		String formatTime = ft.format(cd.getTime());
		return formatTime;
	}

	/**
	 * 日期转换为int 数字
	 * 
	 * @param cd
	 * @return
	 */
	public static int getDateInt(Calendar cd) {
		java.text.DateFormat ft = new java.text.SimpleDateFormat("yyyyMMdd");
		String formatTime = ft.format(cd.getTime());

		return parseInt(formatTime);
	}

	/**
	 * 时间转换为数字
	 * 
	 * @param cd
	 * @return
	 */
	public static int getTimeInt(Calendar cd) {
		java.text.DateFormat ft = new java.text.SimpleDateFormat("HHmm");
		String formatTime = ft.format(cd.getTime());

		return parseInt(formatTime);
	}

	/**
	 * 获取传入日期的字符串，yyyy-MM-dd
	 * 
	 * @param dt
	 * @return
	 */
	public static String getDateSqlString(Date dt) {
		Calendar cd = Calendar.getInstance();
		cd.setTime(dt);

		return getDateSqlString(cd);
	}

	/**
	 * 获得系统时间 yyyy-MM-dd HH:mm:ss
	 * 
	 * @return
	 */
	public static String getSysNowTime() {
		Date now = new Date();
		java.text.DateFormat ft = new java.text.SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		String formatTime = ft.format(now);
		return formatTime;
	}

	/**
	 * 获得日期字符串 yyyy-MM-dd HH:mm:ss
	 * 
	 * @param cd
	 * @return
	 */
	public static String getDateTime(Calendar cd) {
		java.text.DateFormat ft = new java.text.SimpleDateFormat(
				"yyyy-MM-dd'T'HH:mm:ss");
		String formatTime = ft.format(cd.getTime());
		return formatTime;
	}
 
	/**
	 * 获得日期字符串 yyyy-MM-dd HH:mm:ss
	 * 
	 * @param val
	 * @return
	 */
	public static String getDateTime(String val) {
		java.text.DateFormat ft = new java.text.SimpleDateFormat(
				"yyyy-MM-dd'T'HH:mm:ss");
		 
		String formatTime = ft.format(val);
		return formatTime;
	}

	/**
	 * 判断是否为整数 INT
	 * 
	 * @param val
	 * @return
	 */
	public static Boolean isInt(String val) {
		try {
			Integer.parseInt(val);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * 判断是否为Double
	 * 
	 * @param val
	 * @return
	 */
	public static Boolean isDouble(String val) {
		try {
			Double.parseDouble(val);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * 字符串转换为 double
	 * 
	 * @param val
	 * @return
	 */
	public static double parseDouble(String val) {
		val = val.replace(",", "");
		if (val.equals(""))
			val = "0";
		return Double.parseDouble(val);
	}

	/**
	 * 字符串转换为 int
	 * 
	 * @param val
	 * @return
	 */
	public static int parseInt(String val) {
		double d = parseDouble(val);
		return (int) Math.round(d);
	}

	public static String covertToDouble(String val,int decimal) {
		try {
			val = val.replace(",", "");
			return covertToDouble(Double.parseDouble(val),decimal);
		} catch (Exception e) {
			return val;
		}
	}
	
	public static String covertToDouble(Double val,int decimal) {
		String fmt = "#,##0";
		if(decimal > 0)
		{
			fmt = fmt + ".";
			for(int i = 0; i < decimal; i ++)
			{
				fmt = fmt + "0";
			}
		}
		DecimalFormat df = new DecimalFormat(fmt);
		return df.format(val);
	}
	
	public static double covertToDoubleValue(Double val,int decimal) {
		String fmt = "#,##0";
		if(decimal > 0)
		{
			fmt = fmt + ".";
			for(int i = 0; i < decimal; i ++)
			{
				fmt = fmt + "0";
			}
		}
		DecimalFormat df = new DecimalFormat(fmt);
		return parseDouble(df.format(val));
	}
	
	/**
	 * 转换为金额显示
	 * 
	 * @param val
	 * @return
	 */
	public static String covertToCash(String val) {
		try {
			val = val.replace(",", "");
			return covertToCash(Double.parseDouble(val));
		} catch (Exception e) {
			return val;
		}
	}

	/**
	 * 转换为金额显示
	 * 
	 * @param val
	 * @return
	 */
	public static String covertToCash(Double val) {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return df.format(val);
	}

	/***
	 * 保留2为小数
	 * 
	 * @param d
	 * @return
	 */
	public static double getRound2(double d) {
		return (double) (Math.round(d * 100)) / 100;
	}

	/***
	 * 百分比显示
	 * 
	 * @param d
	 * @return
	 */
	public static String getPercent(double d) {
		return (double) (Math.round(d * 100 * 100)) / 100 + "%";
	}

	/**
	 * 获得最近一个周一
	 * 
	 * @param dateValue
	 * @return
	 */
	public static Calendar getRecentMonday(Calendar dateValue) {
		if (dateValue.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
			return dateValue;
		} else {
			Calendar temp = (Calendar) dateValue.clone();
			temp.add(Calendar.DATE, -1);
			return getRecentMonday(temp);
		}
	}

	/**
	 * 获得之后一个周日
	 * 
	 * @param dateValue
	 * @return
	 */
	public static Calendar getNextSunday(Calendar dateValue) {
		if (dateValue.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			return dateValue;
		} else {
			Calendar temp = (Calendar) dateValue.clone();
			temp.add(Calendar.DATE, 1);
			return getNextSunday(temp);
		}
	}

	/**
	 * 获得所在日期当月的第一天
	 * 
	 * @param dateValue
	 * @return
	 */
	public static Calendar getFirstDayOfMonth(Calendar dateValue) {
		Calendar temp = (Calendar) dateValue.clone();
		temp.add(Calendar.DATE, 1 - dateValue.get(Calendar.DAY_OF_MONTH));
		return temp;
	}

	/**
	 * 获得所在日期当月的最后一天
	 * 
	 * @param dateValue
	 * @return
	 */
	public static Calendar getLastDayOfMonth(Calendar dateValue) {
		Calendar calendar = (Calendar) dateValue.clone();
		calendar.set(Calendar.DAY_OF_MONTH,
				calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		return calendar;
	}
 

	public static Bundle getIntentExtras(Intent data) {
		// data is null, when activity cancelled by BACK BUTTON
		if (data != null) {
			Bundle extras = data.getExtras();
			if (extras != null) {
				return extras;
			}
		}
		return null;
	}

	/**
	 * 设置数据发生变化的标记
	 * 
	 * @param act
	 */
	public static void setDataChangedFlag(Activity act) {
		Bundle bundle = new Bundle();
		bundle.putString("DataChanged", "Y");
		Intent intent = new Intent();
		intent.putExtras(bundle);
		act.setResult(-1, intent);
	}

	/**
	 * MD5 加密算法
	 * 
	 * @param val
	 * @return
	 */
	public static String MD5(String val) {
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.update(val.getBytes());
			byte[] m = md5.digest();
			return toHexString(m);
		} catch (Exception ex) {
			Log.e("MD5", "MD5加密计算失败！" + ex.getMessage());
			return "";
		}
	}

	private static final char HEX_DIGITS[] = { '0', '1', '2', '3', '4', '5',
			'6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

	private static String toHexString(byte[] b) {
		StringBuilder sb = new StringBuilder(b.length * 2);
		for (int i = 0; i < b.length; i++) {
			sb.append(HEX_DIGITS[(b[i] & 0xf0) >>> 4]);
			sb.append(HEX_DIGITS[(b[i]) & 0x0f]);
		}
		return sb.toString();
	}

	 
	public static Calendar GetDateByValue(int year, int month, int date) {
		Calendar localCalendar = Calendar.getInstance();
		localCalendar.set(Calendar.YEAR, year);
		localCalendar.set(Calendar.MONTH, month);
		localCalendar.set(Calendar.DATE, date);
		return localCalendar;
	}

	public static String covertToCashInt(Integer paramInteger) {
		return new DecimalFormat("#,##0").format(paramInteger);
	}

	public static String covertToCashInt(String paramString) {
		return covertToCashInt(Integer.valueOf((int) Double
				.parseDouble(paramString.replace(",", ""))));
	}

	public static String getWeek(int weekInt) {
		String val = "Error";
		switch (weekInt) {
		case Calendar.SUNDAY:
			val = "周日";
			break;
		case Calendar.SATURDAY:
			val = "周六";
			break;
		case Calendar.MONDAY:
			val = "周一";
			break;
		case Calendar.TUESDAY:
			val = "周二";
			break;
		case Calendar.WEDNESDAY:
			val = "周三";
			break;
		case Calendar.THURSDAY:
			val = "周四";
			break;
		case Calendar.FRIDAY:
			val = "周五";
			break;
		}

		return val;
	}
 
	public static int getInterval(Calendar cdBegin, Calendar deEnd, int f) {
		int hours = 0;
		try {
			Date beginDate = cdBegin.getTime();
			Date endDate = deEnd.getTime();
			double millisecond = endDate.getTime() - beginDate.getTime(); // 日期相减得到日期差X(单位:毫秒)
			/**
			 * 1秒 = 1000毫秒 millisecond/1000 --> 秒 millisecond/1000*60 - > 分钟
			 * millisecond/(1000*60*60) -- > 小时 millisecond/(1000*60*60*24) -->
			 * 天
			 * */
			switch (f) {
			case 0: // second
				return Math.abs((int) (millisecond / 1000));
			case 1: // minute
				return Math.abs((int) (millisecond / (1000 * 60)));
			case 2: // hour
				return Math.abs((int) (millisecond / (1000 * 60 * 60)));
			case 3: // day
				double intval = (millisecond / (1000 * 60 * 60 * 24));
				return (int) Math.round(intval);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return hours;
	}
 
	public static String listToString(List<String> list, String separator) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != null && list.get(i) != "") {
				sb.append(list.get(i)).append(separator);
			}
		}
		String val = sb.toString();
		if (val.length() > 1) {
			val = val.substring(0, sb.toString().length() - 1);
		}
		return val;
	}
	
}
