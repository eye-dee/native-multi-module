package com.eyedee.common.service

import com.eyedee.common.model.Something
import org.springframework.stereotype.Service

@Service
class CommonService {

    fun getSomething(): Something = Something("Something")
}
