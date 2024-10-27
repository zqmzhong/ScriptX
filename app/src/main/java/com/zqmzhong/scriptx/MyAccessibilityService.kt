package com.zqmzhong.scriptx

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent

class MyAccessibilityService : AccessibilityService() {

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        // 在这里处理无障碍事件
    }

    override fun onInterrupt() {
        // 在服务中断时处理
    }
}
