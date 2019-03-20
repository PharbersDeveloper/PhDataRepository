package com.pharbers.model

import org.bson.types.ObjectId

case class addressExcelData(region: String, location: String, province: String, city: String, prefecture: String, tier: Int,
                            var addressID:String = "", var prefectureID: String = "", var cityID: String = "", var provinceID: String = "", var tierID: String = "", var regionID: String = "" ) {

}
