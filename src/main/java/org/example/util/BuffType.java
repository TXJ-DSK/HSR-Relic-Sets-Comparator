package org.example.util;

public enum BuffType {
    // In number

    // 小攻击，遗器手，固定攻击
    ATK_FLAT,

    // In percentage

    ATK_RATIO,
    CRIT_RATE,
    CRIT_DMG,

    // 元素增伤和全增伤
    DMG_BOOST_ELEM,
    DMG_BOOST_ALL,

    // 减防和无视防御，效果相同
    DEF_REDUCTION,
    DEF_IGNORE,

    // 减抗和抗穿，效果相同
    RES_REDUCTION,
    RES_PEN,

    // 元素易伤和全易伤
    VULN_ELEM,
    VULN_ALL,

    // 百分比真实伤害
    TRUE_DMG,

    // 额外独立乘区
    OTHERS_RATIO
}
