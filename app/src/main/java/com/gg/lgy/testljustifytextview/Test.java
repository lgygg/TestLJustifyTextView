package com.gg.lgy.testljustifytextview;

import android.app.Activity;
import android.os.Bundle;

public class Test extends Activity
{
	private BodyLayout bodyLayout = null;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		bodyLayout = new BodyLayout(this);
		if (bodyLayout!=null)
		{
			setContentView(bodyLayout);
		}
	}
}
