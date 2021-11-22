package donatogomez.com.appofthrones

import android.os.Build
import androidx.annotation.RequiresApi
import java.util.*

data class Character(
    var id: String = UUID.randomUUID().toString(),
    var name: String,
    var born: String,
    var title: String,
    var actor: String,
    var quote: String,
    var father: String,
    var mother: String,
    var spouse: String,
    var house: House
)

data class House(
    var name: String,
    var region: String,
    var words: String) {

    companion object {

        private val DEFAULT_PALETTE = arrayOf(R.color.starkOverlay, R.color.starkBase)

        private val colors = mapOf(
            Pair("stark", arrayOf(R.color.starkOverlay, R.color.starkBase)),
            Pair("lannister", arrayOf(R.color.lannisterOVerlay, R.color.lannisterBase)),
            Pair("tyrell", arrayOf(R.color.tyrellOVerlay, R.color.tyrellBase)),
            Pair("arryn", arrayOf(R.color.arrynOVerlay, R.color.arrynBase)),
            Pair("targaryen", arrayOf(R.color.targaryenOVerlay, R.color.targaryenBase)),
            Pair("martell", arrayOf(R.color.martellOVerlay, R.color.martellBase)),
            Pair("baratheon", arrayOf(R.color.baratheonOVerlay, R.color.baratheonBase)),
            Pair("greyjoy", arrayOf(R.color.greyjoyOVerlay, R.color.greyjoyBase)),
            Pair("frey", arrayOf(R.color.freyOVerlay, R.color.freyBase)),
            Pair("tully", arrayOf(R.color.tullyOVerlay, R.color.tullyBase))
        )

        fun getOverlayColor(houseId: String): Int {
            val pallete: Array<Int> = colors.getOrDefault(houseId, DEFAULT_PALETTE)
            return pallete[0]
        }

        fun getBaseColor(houseId: String): Int {
            val pallete: Array<Int> = colors.getOrDefault(houseId, DEFAULT_PALETTE)
            return pallete[1]

        }
    }
}

