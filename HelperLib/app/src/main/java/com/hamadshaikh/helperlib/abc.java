package com.hamadshaikh.helperlib;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import helper.*;
/**
 * Created by usmankhalil on 31/07/2017.
 */

public class abc extends Activity {

    Helper helper=new Helper();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        helper.getSize(getBaseContext());
    }
}

