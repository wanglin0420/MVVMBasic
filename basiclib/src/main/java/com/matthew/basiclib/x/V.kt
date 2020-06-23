package com.matthew.basiclib.x

/**
 *Author:wangling
 *Date:2020/6/23 9:39 AM
 */
interface V< VM> {


    /**
     * 获取视图资源
     */
    fun getContentView(): Int

    /**
     * 初始化ViewModel的id
     *
     * @return BR的id
     */
    fun initVariableId(): Int
    fun getViewModelClass(): Class<VM>
}
