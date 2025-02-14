package pansong291.xposed.quickenergy.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import pansong291.xposed.quickenergy.R;
import pansong291.xposed.quickenergy.util.Config;
import pansong291.xposed.quickenergy.util.CooperationIdMap;
import pansong291.xposed.quickenergy.util.FriendIdMap;

public class SettingsActivity extends Activity
{
 CheckBox cb_immediateEffect, cb_recordLog, cb_showToast,
 cb_autoRestart,
 cb_collectEnergy, cb_helpFriendCollect, cb_receiveForestTaskAward,
 cb_cooperateWater,
 cb_enableFarm, cb_rewardFriend, cb_sendBackAnimal,
 cb_receiveFarmToolReward, cb_useNewEggTool, cb_harvestProduce,
 cb_donation, cb_answerQuestion, cb_receiveFarmTaskAward,
 cb_feedAnimal, cb_useAccelerateTool, cb_notifyFriend,
 cb_receivePoint;

 @Override
 protected void onCreate(Bundle savedInstanceState)
 {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_settings);

  Config.shouldReload = true;
  FriendIdMap.shouldReload = true;
  CooperationIdMap.shouldReload = true;

  cb_immediateEffect = (CheckBox) findViewById(R.id.cb_immediateEffect);
  cb_recordLog = (CheckBox) findViewById(R.id.cb_recordLog);
  cb_showToast = (CheckBox) findViewById(R.id.cb_showToast);
  cb_autoRestart = (CheckBox) findViewById(R.id.cb_autoRestart);
  cb_collectEnergy = (CheckBox) findViewById(R.id.cb_collectEnergy);
  cb_helpFriendCollect = (CheckBox) findViewById(R.id.cb_helpFriendCollect);
  cb_receiveForestTaskAward = (CheckBox) findViewById(R.id.cb_receiveForestTaskAward);
  cb_cooperateWater = (CheckBox) findViewById(R.id.cb_cooperateWater);
  cb_enableFarm = (CheckBox) findViewById(R.id.cb_enableFarm);
  cb_rewardFriend = (CheckBox) findViewById(R.id.cb_rewardFriend);
  cb_sendBackAnimal = (CheckBox) findViewById(R.id.cb_sendBackAnimal);
  cb_receiveFarmToolReward = (CheckBox) findViewById(R.id.cb_receiveFarmToolReward);
  cb_useNewEggTool = (CheckBox) findViewById(R.id.cb_useNewEggTool);
  cb_harvestProduce = (CheckBox) findViewById(R.id.cb_harvestProduce);
  cb_donation = (CheckBox) findViewById(R.id.cb_donation);
  cb_answerQuestion = (CheckBox) findViewById(R.id.cb_answerQuestion);
  cb_receiveFarmTaskAward = (CheckBox) findViewById(R.id.cb_receiveFarmTaskAward);
  cb_feedAnimal = (CheckBox) findViewById(R.id.cb_feedAnimal);
  cb_useAccelerateTool = (CheckBox) findViewById(R.id.cb_useAccelerateTool);
  cb_notifyFriend = (CheckBox) findViewById(R.id.cb_notifyFriend);
  cb_receivePoint = (CheckBox) findViewById(R.id.cb_receivePoint);
 }

 @Override
 protected void onResume()
 {
  super.onResume();
  cb_immediateEffect.setChecked(Config.immediateEffect());
  cb_recordLog.setChecked(Config.recordLog());
  cb_showToast.setChecked(Config.showToast());
  cb_autoRestart.setChecked(Config.autoRestart());
  cb_collectEnergy.setChecked(Config.collectEnergy());
  cb_helpFriendCollect.setChecked(Config.helpFriendCollect());
  cb_receiveForestTaskAward.setChecked(Config.receiveForestTaskAward());
  cb_cooperateWater.setChecked(Config.cooperateWater());
  cb_enableFarm.setChecked(Config.enableFarm());
  cb_rewardFriend.setChecked(Config.rewardFriend());
  cb_sendBackAnimal.setChecked(Config.sendBackAnimal());
  cb_receiveFarmToolReward.setChecked(Config.receiveFarmToolReward());
  cb_useNewEggTool.setChecked(Config.useNewEggTool());
  cb_harvestProduce.setChecked(Config.harvestProduce());
  cb_donation.setChecked(Config.donation());
  cb_answerQuestion.setChecked(Config.answerQuestion());
  cb_receiveFarmTaskAward.setChecked(Config.receiveFarmTaskAward());
  cb_feedAnimal.setChecked(Config.feedAnimal());
  cb_useAccelerateTool.setChecked(Config.useAccelerateTool());
  cb_notifyFriend.setChecked(Config.notifyFriend());
  cb_receivePoint.setChecked(Config.receivePoint());
 }

 public void onClick(View v)
 {
  CheckBox cb = v instanceof CheckBox ? (CheckBox)v : null;
  Button btn = v instanceof Button ? (Button)v : null;
  switch(v.getId())
  {
   case R.id.cb_immediateEffect:
    Config.setImmediateEffect(cb.isChecked());
    break;

   case R.id.cb_recordLog:
    Config.setRecordLog(cb.isChecked());
    break;

   case R.id.cb_showToast:
    Config.setShowToast(cb.isChecked());
    break;

   case R.id.cb_autoRestart:
    Config.setAutoRestart(cb.isChecked());
    break;

   case R.id.cb_collectEnergy:
    Config.setCollectEnergy(cb.isChecked());
    break;

   case R.id.btn_checkInterval:
    EditDialog.showEditDialog(this, btn.getText(), EditDialog.EditMode.CHECK_INTERVAL);
    break;

   case R.id.btn_threadCount:
    EditDialog.showEditDialog(this, btn.getText(), EditDialog.EditMode.THREAD_COUNT);
    break;

   case R.id.btn_advanceTime:
    EditDialog.showEditDialog(this, btn.getText(), EditDialog.EditMode.ADVANCE_TIME);
    break;

   case R.id.btn_collectInterval:
    EditDialog.showEditDialog(this, btn.getText(), EditDialog.EditMode.COLLECT_INTERVAL);
    break;

   case R.id.btn_collectTimeout:
    EditDialog.showEditDialog(this, btn.getText(), EditDialog.EditMode.COLLECT_TIMEOUT);
    break;

   case R.id.btn_returnWater30:
    EditDialog.showEditDialog(this, btn.getText(), EditDialog.EditMode.RETURN_WATER_30);
    break;

   case R.id.btn_returnWater20:
    EditDialog.showEditDialog(this, btn.getText(), EditDialog.EditMode.RETURN_WATER_20);
    break;

   case R.id.btn_returnWater10:
    EditDialog.showEditDialog(this, btn.getText(), EditDialog.EditMode.RETURN_WATER_10);
    break;

   case R.id.cb_helpFriendCollect:
    Config.setHelpFriendCollect(cb.isChecked());
    break;

   case R.id.btn_dontCollectList:
    ListDialog.show(this, btn.getText(), AlipayUser.getList(), Config.getDontCollectList(), null);
    break;

   case R.id.btn_dontHelpCollectList:
    ListDialog.show(this, btn.getText(), AlipayUser.getList(), Config.getDontHelpCollectList(), null);
    break;

   case R.id.cb_receiveForestTaskAward:
    Config.setReceiveForestTaskAward(cb.isChecked());
    break;

   case R.id.btn_waterFriendList:
    ListDialog.show(this, btn.getText(), AlipayUser.getList(), Config.getWaterFriendList(), Config.getWaterCountList());
    break;

   case R.id.cb_cooperateWater:
    Config.setCooperateWater(cb.isChecked());
    break;

   case R.id.btn_cooperateWaterList:
    ListDialog.show(this, btn.getText(), AlipayCooperate.getList(), Config.getCooperateWaterList(), Config.getcooperateWaterNumList());
    break;

   case R.id.cb_enableFarm:
    Config.setEnableFarm(cb.isChecked());
    break;

   case R.id.cb_rewardFriend:
    Config.setRewardFriend(cb.isChecked());
    break;

   case R.id.cb_sendBackAnimal:
    Config.setSendBackAnimal(cb.isChecked());
    break;

   case R.id.btn_sendType:
    ChoiceDialog.showSendType(this, btn.getText());
    break;

   case R.id.btn_dontSendFriendList:
    ListDialog.show(this, btn.getText(), AlipayUser.getList(), Config.getDontSendFriendList(), null);
    break;

   case R.id.btn_recallAnimalType:
    ChoiceDialog.showRecallAnimalType(this, btn.getText());
    break;

   case R.id.cb_receiveFarmToolReward:
    Config.setReceiveFarmToolReward(cb.isChecked());
    break;

   case R.id.cb_useNewEggTool:
    Config.setUseNewEggTool(cb.isChecked());
    break;

   case R.id.cb_harvestProduce:
    Config.setHarvestProduce(cb.isChecked());
    break;

   case R.id.cb_donation:
    Config.setDonation(cb.isChecked());
    break;

   case R.id.cb_answerQuestion:
    Config.setAnswerQuestion(cb.isChecked());
    break;

   case R.id.cb_receiveFarmTaskAward:
    Config.setReceiveFarmTaskAward(cb.isChecked());
    break;

   case R.id.cb_feedAnimal:
    Config.setFeedAnimal(cb.isChecked());
    break;

   case R.id.cb_useAccelerateTool:
    Config.setUseAccelerateTool(cb.isChecked());
    break;

   case R.id.btn_feedFriendAnimalList:
    ListDialog.show(this, btn.getText(), AlipayUser.getList(), Config.getFeedFriendAnimalList(), Config.getFeedFriendCountList());
    break;

   case R.id.cb_notifyFriend:
    Config.setNotifyFriend(cb.isChecked());
    break;

   case R.id.btn_dontNotifyFriendList:
    ListDialog.show(this, btn.getText(), AlipayUser.getList(), Config.getDontNotifyFriendList(), null);
    break;

   case R.id.cb_receivePoint:
    Config.setReceivePoint(cb.isChecked());
    break;

   case R.id.btn_donation_developer:
    Intent it2 = new Intent(Intent.ACTION_VIEW, Uri.parse("alipays://platformapi/startapp?saId=10000007&qrcode=https://qr.alipay.com/tsx00339eflkuhhtfctcn48"));
    startActivity(it2);
    break;
  }
 }

 @Override
 protected void onPause()
 {
  super.onPause();
  if(Config.hasChanged)
  {
   Config.hasChanged = !Config.saveConfigFile();
   Toast.makeText(this, "Configuration saved", 0).show();
  }
  FriendIdMap.saveIdMap();
  CooperationIdMap.saveIdMap();
 }

}

