package com.gg.lgy.testljustifytextview;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * @author lgy
 * 2016-11-25
 */
public class BodyLayout extends LinearLayout
{
	private Context _context =null;
	private EditText edt_user = null;
	private EditText edt_password = null;
	private EditText edt_address = null;
	private EditText edt_phone = null;
	private float textsize = 16f;

	public BodyLayout(Context context)
	{
		super(context);
		this._context = context;
		initView();
	}

	private void initView()
	{
		edt_user = new EditText(_context);
		edt_password = new EditText(_context);
		edt_address = new EditText(_context);
		edt_phone = new EditText(_context);

		LinearLayout.LayoutParams llParams = new LinearLayout.LayoutParams(
				LinearLayout.LayoutParams.MATCH_PARENT,
				LinearLayout.LayoutParams.MATCH_PARENT);
		this.setLayoutParams(llParams);
		this.setBackgroundColor(Color.WHITE);
		this.setOrientation(LinearLayout.VERTICAL);
		LinearLayout ll_user = new LinearLayout(_context);
		if (ll_user != null)
		{
			llParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
					LinearLayout.LayoutParams.WRAP_CONTENT);
			llParams.bottomMargin = Util.dip2px(_context, 1);
			ll_user.setLayoutParams(llParams);
			ll_user.setBackgroundColor(Color.WHITE);
			ll_user.setOrientation(LinearLayout.HORIZONTAL);
			LJustifyTextView txt_user = new LJustifyTextView(_context);
			if (txt_user != null)
			{
				llParams = new LinearLayout.LayoutParams(Util.dip2px(_context, 80), Util.dip2px(_context, 50));
				txt_user.setLayoutParams(llParams);
				txt_user.setText("用户名");
				txt_user.setTextSize(textsize);
				txt_user.setBackgroundColor(Color.BLUE);
				txt_user.setTextColor(Color.BLACK);
				Log.i("lgy","h:"+txt_user.getHeight()+"w:"+txt_user.getWidth());
				ll_user.addView(txt_user);
			}
			if (edt_user != null)
			{
				edt_user.setSingleLine();
				llParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,Util.dip2px(_context, 50));
				edt_user.setLayoutParams(llParams);
				ll_user.addView(edt_user);
			}
			this.addView(ll_user);
		}

		LinearLayout ll_password = new LinearLayout(_context);
		if (ll_password != null)
		{
			llParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
					Util.dip2px(_context, 50));
			llParams.bottomMargin = Util.dip2px(_context, 1);
			ll_password.setLayoutParams(llParams);
			ll_password.setBackgroundColor(Color.WHITE);
			ll_password.setOrientation(LinearLayout.HORIZONTAL);
			LJustifyTextView txt_password = new LJustifyTextView(_context);
			if (txt_password != null)
			{
				llParams = new LinearLayout.LayoutParams(Util.dip2px(_context, 80), Util.dip2px(_context, 50));
				txt_password.setLayoutParams(llParams);
				txt_password.setText("用户密码");
				txt_password.setTextSize(textsize);
				txt_password.setBackgroundColor(Color.BLUE);
				txt_password.setTextColor(Color.BLACK);
				ll_password.addView(txt_password);
			}
			if (edt_password != null)
			{
				edt_password.setSingleLine();
				llParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
						Util.dip2px(_context, 50));
				edt_password.setLayoutParams(llParams);
				ll_password.addView(edt_password);
			}
			this.addView(ll_password);
		}

		LinearLayout ll_address = new LinearLayout(_context);
		if (ll_address != null)
		{
			llParams = new LinearLayout.LayoutParams(
					LinearLayout.LayoutParams.MATCH_PARENT,
					LinearLayout.LayoutParams.WRAP_CONTENT);
			llParams.bottomMargin = Util.dip2px(_context, 1);
			ll_address.setLayoutParams(llParams);
			ll_address.setBackgroundColor(Color.WHITE);
			ll_address.setOrientation(LinearLayout.HORIZONTAL);
			LJustifyTextView txt_address = new LJustifyTextView(_context);
			if (txt_address != null)
			{
				llParams = new LinearLayout.LayoutParams(Util.dip2px(
						_context, 80), Util.dip2px(_context, 50));
				txt_address.setLayoutParams(llParams);
				txt_address.setText("住址");
			 	txt_address.setTextSize(textsize);
				txt_address.setBackgroundColor(Color.BLUE);
				txt_address.setTextColor(Color.BLACK);
				ll_address.addView(txt_address);
			}
			if (edt_address != null)
			{
				edt_address.setSingleLine();
				llParams = new LinearLayout.LayoutParams(
						LinearLayout.LayoutParams.MATCH_PARENT,
						Util.dip2px(_context, 50));
				edt_address.setLayoutParams(llParams);
				ll_address.addView(edt_address);
			}
			this.addView(ll_address);
		}

		LinearLayout ll_phone = new LinearLayout(_context);
		if (ll_phone != null)
		{
			llParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,Util.dip2px(_context, 50));
			llParams.bottomMargin = Util.dip2px(_context, 1);
			ll_phone.setLayoutParams(llParams);
			ll_phone.setBackgroundColor(Color.WHITE);
			ll_phone.setOrientation(LinearLayout.HORIZONTAL);
			LJustifyTextView txt_phone = new LJustifyTextView(_context);
			if (txt_phone != null)
			{
				llParams = new LinearLayout.LayoutParams(Util.dip2px(_context, 80), Util.dip2px(_context, 50));
				llParams.gravity = Gravity.CENTER_VERTICAL;
				txt_phone.setLayoutParams(llParams);
				txt_phone.setBackgroundColor(Color.BLUE);
				txt_phone.setTextColor(Color.BLACK);
				txt_phone.setTextSize(textsize);
				txt_phone.setText("手机或电话");
				ll_phone.addView(txt_phone);
			}
			if (edt_phone != null)
			{
				edt_phone.setSingleLine();
				llParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,Util.dip2px(_context, 50));
				edt_phone.setLayoutParams(llParams);
				ll_phone.addView(edt_phone);
			}
			this.addView(ll_phone);
		}
	}
}
