package meteor.api.magic

import meteor.api.magic.RunePouch
import meteor.api.magic.Rune
import meteor.api.magic.Magic
import meteor.api.magic.Spell
import meteor.api.magic.RunePouch.RuneSlot
import net.runelite.api.widgets.WidgetInfo

enum class Regular(override val level: Int, override val widget: WidgetInfo) : Spell {
    HOME_TELEPORT(0, WidgetInfo.SPELL_LUMBRIDGE_HOME_TELEPORT), WIND_STRIKE(1, WidgetInfo.SPELL_WIND_STRIKE), CONFUSE(
        3,
        WidgetInfo.SPELL_CONFUSE
    ),
    WATER_STRIKE(5, WidgetInfo.SPELL_WATER_STRIKE), LVL_1_ENCHANT(7, WidgetInfo.SPELL_LVL_1_ENCHANT), EARTH_STRIKE(
        9,
        WidgetInfo.SPELL_EARTH_STRIKE
    ),
    WEAKEN(11, WidgetInfo.SPELL_WEAKEN), FIRE_STRIKE(13, WidgetInfo.SPELL_FIRE_STRIKE), BONES_TO_BANANAS(
        15,
        WidgetInfo.SPELL_BONES_TO_BANANAS
    ),
    WIND_BOLT(17, WidgetInfo.SPELL_WIND_BOLT), CURSE(19, WidgetInfo.SPELL_CURSE), BIND(
        20,
        WidgetInfo.SPELL_BIND
    ),
    LOW_LEVEL_ALCHEMY(21, WidgetInfo.SPELL_LOW_LEVEL_ALCHEMY), WATER_BOLT(
        23,
        WidgetInfo.SPELL_WATER_BOLT
    ),
    VARROCK_TELEPORT(25, WidgetInfo.SPELL_VARROCK_TELEPORT), LVL_2_ENCHANT(
        27,
        WidgetInfo.SPELL_LVL_2_ENCHANT
    ),
    EARTH_BOLT(29, WidgetInfo.SPELL_EARTH_BOLT), LUMBRIDGE_TELEPORT(
        31,
        WidgetInfo.SPELL_LUMBRIDGE_TELEPORT
    ),
    TELEKINETIC_GRAB(31, WidgetInfo.SPELL_TELEKINETIC_GRAB), FIRE_BOLT(
        35,
        WidgetInfo.SPELL_FIRE_BOLT
    ),
    FALADOR_TELEPORT(37, WidgetInfo.SPELL_FALADOR_TELEPORT), CRUMBLE_UNDEAD(
        39,
        WidgetInfo.SPELL_CRUMBLE_UNDEAD
    ),
    TELEPORT_TO_HOUSE(40, WidgetInfo.SPELL_TELEPORT_TO_HOUSE), WIND_BLAST(
        41,
        WidgetInfo.SPELL_WIND_BLAST
    ),
    SUPERHEAT_ITEM(43, WidgetInfo.SPELL_SUPERHEAT_ITEM), CAMELOT_TELEPORT(
        45,
        WidgetInfo.SPELL_CAMELOT_TELEPORT
    ),
    WATER_BLAST(47, WidgetInfo.SPELL_WATER_BLAST), LVL_3_ENCHANT(49, WidgetInfo.SPELL_LVL_3_ENCHANT), IBAN_BLAST(
        50,
        WidgetInfo.SPELL_IBAN_BLAST
    ),
    MAGIC_DART(50, WidgetInfo.SPELL_MAGIC_DART), SNARE(50, WidgetInfo.SPELL_SNARE), ARDOUGNE_TELEPORT(
        51,
        WidgetInfo.SPELL_ARDOUGNE_TELEPORT
    ),
    EARTH_BLAST(53, WidgetInfo.SPELL_EARTH_BLAST), HIGH_LEVEL_ALCHEMY(
        55,
        WidgetInfo.SPELL_HIGH_LEVEL_ALCHEMY
    ),
    CHARGE_WATER_ORB(56, WidgetInfo.SPELL_CHARGE_WATER_ORB), LVL_4_ENCHANT(
        57,
        WidgetInfo.SPELL_LVL_4_ENCHANT
    ),
    WATCHTOWER_TELEPORT(58, WidgetInfo.SPELL_WATCHTOWER_TELEPORT), FIRE_BLAST(
        59,
        WidgetInfo.SPELL_FIRE_BLAST
    ),
    BONES_TO_PEACHES(60, WidgetInfo.SPELL_BONES_TO_PEACHES), CHARGE_EARTH_ORB(
        60,
        WidgetInfo.SPELL_CHARGE_EARTH_ORB
    ),
    SARADOMIN_STRIKE(60, WidgetInfo.SPELL_SARADOMIN_STRIKE), FLAMES_OF_ZAMORAK(
        60,
        WidgetInfo.SPELL_FLAMES_OF_ZAMORAK
    ),
    CLAWS_OF_GUTHIX(60, WidgetInfo.SPELL_CLAWS_OF_GUTHIX), TROLLHEIM_TELEPORT(
        61,
        WidgetInfo.SPELL_TROLLHEIM_TELEPORT
    ),
    WIND_WAVE(62, WidgetInfo.SPELL_WIND_WAVE), CHARGE_FIRE_ORB(
        63,
        WidgetInfo.SPELL_CHARGE_FIRE_ORB
    ),
    TELEPORT_TO_APE_ATOLL(64, WidgetInfo.SPELL_TELEPORT_TO_APE_ATOLL), WATER_WAVE(
        65,
        WidgetInfo.SPELL_WATER_WAVE
    ),
    CHARGE_AIR_ORB(66, WidgetInfo.SPELL_CHARGE_AIR_ORB), VULNERABILITY(
        66,
        WidgetInfo.SPELL_VULNERABILITY
    ),
    LVL_5_ENCHANT(68, WidgetInfo.SPELL_LVL_5_ENCHANT), TELEPORT_TO_KOUREND(
        69,
        WidgetInfo.SPELL_TELEPORT_TO_KOUREND
    ),
    EARTH_WAVE(70, WidgetInfo.SPELL_EARTH_WAVE), ENFEEBLE(73, WidgetInfo.SPELL_ENFEEBLE), TELEOTHER_LUMBRIDGE(
        74,
        WidgetInfo.SPELL_TELEOTHER_LUMBRIDGE
    ),
    FIRE_WAVE(75, WidgetInfo.SPELL_FIRE_WAVE), ENTANGLE(79, WidgetInfo.SPELL_ENTANGLE), STUN(
        80,
        WidgetInfo.SPELL_STUN
    ),
    CHARGE(80, WidgetInfo.SPELL_CHARGE), WIND_SURGE(81, WidgetInfo.SPELL_WIND_SURGE), TELEOTHER_FALADOR(
        82,
        WidgetInfo.SPELL_TELEOTHER_FALADOR
    ),
    TELE_BLOCK(85, WidgetInfo.SPELL_TELE_BLOCK), TELEPORT_TO_BOUNTY_TARGET(
        85,
        WidgetInfo.SPELL_BOUNTY_TARGET_TELEPORT
    ),
    WATER_SURGE(85, WidgetInfo.SPELL_WATER_SURGE), LVL_6_ENCHANT(87, WidgetInfo.SPELL_LVL_6_ENCHANT), TELEOTHER_CAMELOT(
        90,
        WidgetInfo.SPELL_TELEOTHER_CAMELOT
    ),
    EARTH_SURGE(90, WidgetInfo.SPELL_EARTH_SURGE), LVL_7_ENCHANT(93, WidgetInfo.SPELL_LVL_7_ENCHANT), FIRE_SURGE(
        95,
        WidgetInfo.SPELL_FIRE_SURGE
    );

}