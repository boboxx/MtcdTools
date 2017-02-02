package com.f1x.mtcdtools.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.f1x.mtcdtools.R;
import com.f1x.mtcdtools.StartActivityButtonClickListener;
import com.f1x.mtcdtools.activities.actions.CreateActionActivity;
import com.f1x.mtcdtools.activities.actions.ManageActionsActivity;
import com.f1x.mtcdtools.service.MtcdService;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button createActionButton = (Button)this.findViewById(R.id.buttonCreateNewAction);
        createActionButton.setOnClickListener(new StartActivityButtonClickListener(this, CreateActionActivity.class));

        Button createBindingButton = (Button)this.findViewById(R.id.buttonCreateNewBinding);
        createBindingButton.setOnClickListener(new StartActivityButtonClickListener(this, BindingActivity.class));

        Button createActionsListButton = (Button)this.findViewById(R.id.buttonCreateNewActionsList);
        createActionsListButton.setOnClickListener(new StartActivityButtonClickListener(this, ActionsListActivity.class));

        Button manageActionsButton = (Button)this.findViewById(R.id.buttonManageActions);
        manageActionsButton.setOnClickListener(new StartActivityButtonClickListener(this, ManageActionsActivity.class));

        Button manageActionsListsButton = (Button)this.findViewById(R.id.buttonManageActionsLists);
        manageActionsListsButton.setOnClickListener(new StartActivityButtonClickListener(this, ManageActionsListsActivity.class));

        Button manageBindingsButton = (Button)this.findViewById(R.id.buttonManageBindings);
        manageBindingsButton.setOnClickListener(new StartActivityButtonClickListener(this, ManageBindingsActivity.class));

        Button settingsButton = (Button)this.findViewById(R.id.buttonSettings);
        settingsButton.setOnClickListener(new StartActivityButtonClickListener(this, SettingsActivity.class));

        this.startService(new Intent(this, MtcdService.class));
    }

    public static String APP_NAME = "MtcdTools";
}
