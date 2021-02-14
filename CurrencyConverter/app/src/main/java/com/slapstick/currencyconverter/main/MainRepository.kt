package com.slapstick.currencyconverter.main

import com.slapstick.currencyconverter.data.model.CurrencyResponse
import com.slapstick.currencyconverter.util.Resource

interface MainRepository {
    suspend fun getRates(base: String): Resource<CurrencyResponse>
}