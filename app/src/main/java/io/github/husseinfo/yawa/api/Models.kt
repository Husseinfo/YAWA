package io.github.husseinfo.yawa.api

data class ForecastResponse(
    val hourly: List<HourlyModel>
)

data class HourlyModel(
    val time: List<String>,
    val hourly_2m: List<Float>
)
