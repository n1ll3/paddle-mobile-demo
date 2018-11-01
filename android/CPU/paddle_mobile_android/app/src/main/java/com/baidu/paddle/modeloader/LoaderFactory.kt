package com.baidu.paddle.modeloader

object LoaderFactory {
    fun buildLoader(type: ModelType): ModelLoader = when (type) {
        ModelType.mobilenet -> MobileNetModelLoaderImpl()
        else -> {
            throw IllegalAccessException("load unregisted model")
        }
    }
}