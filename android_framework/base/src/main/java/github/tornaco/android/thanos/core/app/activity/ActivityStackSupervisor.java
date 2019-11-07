package github.tornaco.android.thanos.core.app.activity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

import github.tornaco.android.thanos.core.app.component.ComponentReplacement;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class ActivityStackSupervisor {

    public static final long LOCKER_VERIFY_TIMEOUT_MILLS = 60 * 1000;

    public class LockerMethod {
        public static final int NONE = -1;
        public static final int PIN = 0;
        public static final int PATTERN = 1;
    }

    private IActivityStackSupervisor supervisor;

    @SneakyThrows
    public boolean checkActivity(ComponentName componentName) {
        return supervisor.checkActivity(componentName);
    }

    @SneakyThrows
    public Intent replaceActivityStartingIntent(Intent intent) {
        return supervisor.replaceActivityStartingIntent(intent);
    }

    @SneakyThrows
    public boolean shouldVerifyActivityStarting(ComponentName componentName, String pkg, String source) {
        return supervisor.shouldVerifyActivityStarting(componentName, pkg, source);
    }

    @SneakyThrows
    public void verifyActivityStarting(Bundle options, String pkg, ComponentName componentName, int uid, int pid, IVerifyCallback callback) {
        supervisor.verifyActivityStarting(options, pkg, componentName, uid, pid, callback);
    }

    @SneakyThrows
    public void reportActivityLaunching(Intent intent, String reason) {
        supervisor.reportActivityLaunching(intent, reason);
    }

    @SneakyThrows
    public String getCurrentFrontApp() {
        return supervisor.getCurrentFrontApp();
    }

    @SneakyThrows
    public void setAppLockEnabled(boolean enabled) {
        supervisor.setAppLockEnabled(enabled);
    }

    @SneakyThrows
    public boolean isAppLockEnabled() {
        return supervisor.isAppLockEnabled();
    }

    @SneakyThrows
    public boolean isPackageLocked(String pkg) {
        return supervisor.isPackageLocked(pkg);
    }

    @SneakyThrows
    public void setPackageLocked(String pkg, boolean locked) {
        supervisor.setPackageLocked(pkg, locked);
    }

    @SneakyThrows
    public void setVerifyResult(int request, int result, int reason) {
        supervisor.setVerifyResult(request, result, reason);
    }

    @SneakyThrows
    public void setLockerMethod(int method) {
        supervisor.setLockerMethod(method);
    }

    @SneakyThrows
    public int getLockerMethod() {
        return supervisor.getLockerMethod();
    }

    @SneakyThrows
    public void setLockerKey(int method, String key) {
        supervisor.setLockerKey(method, key);
    }

    @SneakyThrows
    public boolean isLockerKeyValid(int method, String key) {
        return supervisor.isLockerKeyValid(method, key);
    }

    @SneakyThrows
    public boolean isLockerKeySet(int method) {
        return supervisor.isLockerKeySet(method);
    }

    @SneakyThrows
    public boolean isFingerPrintEnabled() {
        return supervisor.isFingerPrintEnabled();
    }

    @SneakyThrows
    public void setFingerPrintEnabled(boolean enable) {
        supervisor.setFingerPrintEnabled(enable);
    }

    @SneakyThrows
    public void addComponentReplacement(ComponentReplacement replacement) {
        supervisor.addComponentReplacement(replacement);
    }

    @SneakyThrows
    public void removeComponentReplacement(ComponentReplacement replacement) {
        supervisor.removeComponentReplacement(replacement);
    }

    @SneakyThrows
    public ComponentReplacement[] getComponentReplacements() {
        return supervisor.getComponentReplacements();
    }

}
