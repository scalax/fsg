package asuna.testkit
import asuna.macros.single.PropertyApply
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
class Test196 extends AnyFunSpec with Matchers {
  case class Foo196(
    i1: Long,
    i2: Int,
    i3: Int,
    i4: String,
    i5: Long,
    i6: Int,
    i7: Int,
    i8: String,
    i9: Long,
    i10: Int,
    i11: Int,
    i12: String,
    i13: Long,
    i14: Int,
    i15: Int,
    i16: String,
    i17: Long,
    i18: Int,
    i19: Int,
    i20: String,
    i21: Long,
    i22: Int,
    i23: Int,
    i24: String,
    i25: Long,
    i26: Int,
    i27: Int,
    i28: String,
    i29: Long,
    i30: Int,
    i31: Int,
    i32: String,
    i33: Long,
    i34: Int,
    i35: Int,
    i36: String,
    i37: Long,
    i38: Int,
    i39: Int,
    i40: String,
    i41: Long,
    i42: Int,
    i43: Int,
    i44: String,
    i45: Long,
    i46: Int,
    i47: Int,
    i48: String,
    i49: Long,
    i50: Int,
    i51: Int,
    i52: String,
    i53: Long,
    i54: Int,
    i55: Int,
    i56: String,
    i57: Long,
    i58: Int,
    i59: Int,
    i60: String,
    i61: Long,
    i62: Int,
    i63: Int,
    i64: String,
    i65: Long,
    i66: Int,
    i67: Int,
    i68: String,
    i69: Long,
    i70: Int,
    i71: Int,
    i72: String,
    i73: Long,
    i74: Int,
    i75: Int,
    i76: String,
    i77: Long,
    i78: Int,
    i79: Int,
    i80: String,
    i81: Long,
    i82: Int,
    i83: Int,
    i84: String,
    i85: Long,
    i86: Int,
    i87: Int,
    i88: String,
    i89: Long,
    i90: Int,
    i91: Int,
    i92: String,
    i93: Long,
    i94: Int,
    i95: Int,
    i96: String,
    i97: Long,
    i98: Int,
    i99: Int,
    i100: String,
    i101: Long,
    i102: Int,
    i103: Int,
    i104: String,
    i105: Long,
    i106: Int,
    i107: Int,
    i108: String,
    i109: Long,
    i110: Int,
    i111: Int,
    i112: String,
    i113: Long,
    i114: Int,
    i115: Int,
    i116: String,
    i117: Long,
    i118: Int,
    i119: Int,
    i120: String,
    i121: Long,
    i122: Int,
    i123: Int,
    i124: String,
    i125: Long,
    i126: Int,
    i127: Int,
    i128: String,
    i129: Long,
    i130: Int,
    i131: Int,
    i132: String,
    i133: Long,
    i134: Int,
    i135: Int,
    i136: String,
    i137: Long,
    i138: Int,
    i139: Int,
    i140: String,
    i141: Long,
    i142: Int,
    i143: Int,
    i144: String,
    i145: Long,
    i146: Int,
    i147: Int,
    i148: String,
    i149: Long,
    i150: Int,
    i151: Int,
    i152: String,
    i153: Long,
    i154: Int,
    i155: Int,
    i156: String,
    i157: Long,
    i158: Int,
    i159: Int,
    i160: String,
    i161: Long,
    i162: Int,
    i163: Int,
    i164: String,
    i165: Long,
    i166: Int,
    i167: Int,
    i168: String,
    i169: Long,
    i170: Int,
    i171: Int,
    i172: String,
    i173: Long,
    i174: Int,
    i175: Int,
    i176: String,
    i177: Long,
    i178: Int,
    i179: Int,
    i180: String,
    i181: Long,
    i182: Int,
    i183: Int,
    i184: String,
    i185: Long,
    i186: Int,
    i187: Int,
    i188: String,
    i189: Long,
    i190: Int,
    i191: Int,
    i192: String,
    i193: Long,
    i194: Int,
    i195: Int,
    i196: String
  ) {
    self =>
    override def toString: String =
      s"(Long" + s"(${self.i1}),i1)|" + s"(Int" + s"(${self.i2}),i2)|" + s"(Int" + s"(${self.i3}),i3)|" + s"(String" + s"(${self.i4}),i4)|" + s"(Long" + s"(${self.i5}),i5)|" + s"(Int" + s"(${self.i6}),i6)|" + s"(Int" + s"(${self.i7}),i7)|" + s"(String" + s"(${self.i8}),i8)|" + s"(Long" + s"(${self.i9}),i9)|" + s"(Int" + s"(${self.i10}),i10)|" + s"(Int" + s"(${self.i11}),i11)|" + s"(String" + s"(${self.i12}),i12)|" + s"(Long" + s"(${self.i13}),i13)|" + s"(Int" + s"(${self.i14}),i14)|" + s"(Int" + s"(${self.i15}),i15)|" + s"(String" + s"(${self.i16}),i16)|" + s"(Long" + s"(${self.i17}),i17)|" + s"(Int" + s"(${self.i18}),i18)|" + s"(Int" + s"(${self.i19}),i19)|" + s"(String" + s"(${self.i20}),i20)|" + s"(Long" + s"(${self.i21}),i21)|" + s"(Int" + s"(${self.i22}),i22)|" + s"(Int" + s"(${self.i23}),i23)|" + s"(String" + s"(${self.i24}),i24)|" + s"(Long" + s"(${self.i25}),i25)|" + s"(Int" + s"(${self.i26}),i26)|" + s"(Int" + s"(${self.i27}),i27)|" + s"(String" + s"(${self.i28}),i28)|" + s"(Long" + s"(${self.i29}),i29)|" + s"(Int" + s"(${self.i30}),i30)|" + s"(Int" + s"(${self.i31}),i31)|" + s"(String" + s"(${self.i32}),i32)|" + s"(Long" + s"(${self.i33}),i33)|" + s"(Int" + s"(${self.i34}),i34)|" + s"(Int" + s"(${self.i35}),i35)|" + s"(String" + s"(${self.i36}),i36)|" + s"(Long" + s"(${self.i37}),i37)|" + s"(Int" + s"(${self.i38}),i38)|" + s"(Int" + s"(${self.i39}),i39)|" + s"(String" + s"(${self.i40}),i40)|" + s"(Long" + s"(${self.i41}),i41)|" + s"(Int" + s"(${self.i42}),i42)|" + s"(Int" + s"(${self.i43}),i43)|" + s"(String" + s"(${self.i44}),i44)|" + s"(Long" + s"(${self.i45}),i45)|" + s"(Int" + s"(${self.i46}),i46)|" + s"(Int" + s"(${self.i47}),i47)|" + s"(String" + s"(${self.i48}),i48)|" + s"(Long" + s"(${self.i49}),i49)|" + s"(Int" + s"(${self.i50}),i50)|" + s"(Int" + s"(${self.i51}),i51)|" + s"(String" + s"(${self.i52}),i52)|" + s"(Long" + s"(${self.i53}),i53)|" + s"(Int" + s"(${self.i54}),i54)|" + s"(Int" + s"(${self.i55}),i55)|" + s"(String" + s"(${self.i56}),i56)|" + s"(Long" + s"(${self.i57}),i57)|" + s"(Int" + s"(${self.i58}),i58)|" + s"(Int" + s"(${self.i59}),i59)|" + s"(String" + s"(${self.i60}),i60)|" + s"(Long" + s"(${self.i61}),i61)|" + s"(Int" + s"(${self.i62}),i62)|" + s"(Int" + s"(${self.i63}),i63)|" + s"(String" + s"(${self.i64}),i64)|" + s"(Long" + s"(${self.i65}),i65)|" + s"(Int" + s"(${self.i66}),i66)|" + s"(Int" + s"(${self.i67}),i67)|" + s"(String" + s"(${self.i68}),i68)|" + s"(Long" + s"(${self.i69}),i69)|" + s"(Int" + s"(${self.i70}),i70)|" + s"(Int" + s"(${self.i71}),i71)|" + s"(String" + s"(${self.i72}),i72)|" + s"(Long" + s"(${self.i73}),i73)|" + s"(Int" + s"(${self.i74}),i74)|" + s"(Int" + s"(${self.i75}),i75)|" + s"(String" + s"(${self.i76}),i76)|" + s"(Long" + s"(${self.i77}),i77)|" + s"(Int" + s"(${self.i78}),i78)|" + s"(Int" + s"(${self.i79}),i79)|" + s"(String" + s"(${self.i80}),i80)|" + s"(Long" + s"(${self.i81}),i81)|" + s"(Int" + s"(${self.i82}),i82)|" + s"(Int" + s"(${self.i83}),i83)|" + s"(String" + s"(${self.i84}),i84)|" + s"(Long" + s"(${self.i85}),i85)|" + s"(Int" + s"(${self.i86}),i86)|" + s"(Int" + s"(${self.i87}),i87)|" + s"(String" + s"(${self.i88}),i88)|" + s"(Long" + s"(${self.i89}),i89)|" + s"(Int" + s"(${self.i90}),i90)|" + s"(Int" + s"(${self.i91}),i91)|" + s"(String" + s"(${self.i92}),i92)|" + s"(Long" + s"(${self.i93}),i93)|" + s"(Int" + s"(${self.i94}),i94)|" + s"(Int" + s"(${self.i95}),i95)|" + s"(String" + s"(${self.i96}),i96)|" + s"(Long" + s"(${self.i97}),i97)|" + s"(Int" + s"(${self.i98}),i98)|" + s"(Int" + s"(${self.i99}),i99)|" + s"(String" + s"(${self.i100}),i100)|" + s"(Long" + s"(${self.i101}),i101)|" + s"(Int" + s"(${self.i102}),i102)|" + s"(Int" + s"(${self.i103}),i103)|" + s"(String" + s"(${self.i104}),i104)|" + s"(Long" + s"(${self.i105}),i105)|" + s"(Int" + s"(${self.i106}),i106)|" + s"(Int" + s"(${self.i107}),i107)|" + s"(String" + s"(${self.i108}),i108)|" + s"(Long" + s"(${self.i109}),i109)|" + s"(Int" + s"(${self.i110}),i110)|" + s"(Int" + s"(${self.i111}),i111)|" + s"(String" + s"(${self.i112}),i112)|" + s"(Long" + s"(${self.i113}),i113)|" + s"(Int" + s"(${self.i114}),i114)|" + s"(Int" + s"(${self.i115}),i115)|" + s"(String" + s"(${self.i116}),i116)|" + s"(Long" + s"(${self.i117}),i117)|" + s"(Int" + s"(${self.i118}),i118)|" + s"(Int" + s"(${self.i119}),i119)|" + s"(String" + s"(${self.i120}),i120)|" + s"(Long" + s"(${self.i121}),i121)|" + s"(Int" + s"(${self.i122}),i122)|" + s"(Int" + s"(${self.i123}),i123)|" + s"(String" + s"(${self.i124}),i124)|" + s"(Long" + s"(${self.i125}),i125)|" + s"(Int" + s"(${self.i126}),i126)|" + s"(Int" + s"(${self.i127}),i127)|" + s"(String" + s"(${self.i128}),i128)|" + s"(Long" + s"(${self.i129}),i129)|" + s"(Int" + s"(${self.i130}),i130)|" + s"(Int" + s"(${self.i131}),i131)|" + s"(String" + s"(${self.i132}),i132)|" + s"(Long" + s"(${self.i133}),i133)|" + s"(Int" + s"(${self.i134}),i134)|" + s"(Int" + s"(${self.i135}),i135)|" + s"(String" + s"(${self.i136}),i136)|" + s"(Long" + s"(${self.i137}),i137)|" + s"(Int" + s"(${self.i138}),i138)|" + s"(Int" + s"(${self.i139}),i139)|" + s"(String" + s"(${self.i140}),i140)|" + s"(Long" + s"(${self.i141}),i141)|" + s"(Int" + s"(${self.i142}),i142)|" + s"(Int" + s"(${self.i143}),i143)|" + s"(String" + s"(${self.i144}),i144)|" + s"(Long" + s"(${self.i145}),i145)|" + s"(Int" + s"(${self.i146}),i146)|" + s"(Int" + s"(${self.i147}),i147)|" + s"(String" + s"(${self.i148}),i148)|" + s"(Long" + s"(${self.i149}),i149)|" + s"(Int" + s"(${self.i150}),i150)|" + s"(Int" + s"(${self.i151}),i151)|" + s"(String" + s"(${self.i152}),i152)|" + s"(Long" + s"(${self.i153}),i153)|" + s"(Int" + s"(${self.i154}),i154)|" + s"(Int" + s"(${self.i155}),i155)|" + s"(String" + s"(${self.i156}),i156)|" + s"(Long" + s"(${self.i157}),i157)|" + s"(Int" + s"(${self.i158}),i158)|" + s"(Int" + s"(${self.i159}),i159)|" + s"(String" + s"(${self.i160}),i160)|" + s"(Long" + s"(${self.i161}),i161)|" + s"(Int" + s"(${self.i162}),i162)|" + s"(Int" + s"(${self.i163}),i163)|" + s"(String" + s"(${self.i164}),i164)|" + s"(Long" + s"(${self.i165}),i165)|" + s"(Int" + s"(${self.i166}),i166)|" + s"(Int" + s"(${self.i167}),i167)|" + s"(String" + s"(${self.i168}),i168)|" + s"(Long" + s"(${self.i169}),i169)|" + s"(Int" + s"(${self.i170}),i170)|" + s"(Int" + s"(${self.i171}),i171)|" + s"(String" + s"(${self.i172}),i172)|" + s"(Long" + s"(${self.i173}),i173)|" + s"(Int" + s"(${self.i174}),i174)|" + s"(Int" + s"(${self.i175}),i175)|" + s"(String" + s"(${self.i176}),i176)|" + s"(Long" + s"(${self.i177}),i177)|" + s"(Int" + s"(${self.i178}),i178)|" + s"(Int" + s"(${self.i179}),i179)|" + s"(String" + s"(${self.i180}),i180)|" + s"(Long" + s"(${self.i181}),i181)|" + s"(Int" + s"(${self.i182}),i182)|" + s"(Int" + s"(${self.i183}),i183)|" + s"(String" + s"(${self.i184}),i184)|" + s"(Long" + s"(${self.i185}),i185)|" + s"(Int" + s"(${self.i186}),i186)|" + s"(Int" + s"(${self.i187}),i187)|" + s"(String" + s"(${self.i188}),i188)|" + s"(Long" + s"(${self.i189}),i189)|" + s"(Int" + s"(${self.i190}),i190)|" + s"(Int" + s"(${self.i191}),i191)|" + s"(String" + s"(${self.i192}),i192)|" + s"(Long" + s"(${self.i193}),i193)|" + s"(Int" + s"(${self.i194}),i194)|" + s"(Int" + s"(${self.i195}),i195)|" + s"(String" + s"(${self.i196}),i196)"
    def reverseString: String =
      s"(String" + s"(${self.i196}),i196)|" + s"(Int" + s"(${self.i195}),i195)|" + s"(Int" + s"(${self.i194}),i194)|" + s"(Long" + s"(${self.i193}),i193)|" + s"(String" + s"(${self.i192}),i192)|" + s"(Int" + s"(${self.i191}),i191)|" + s"(Int" + s"(${self.i190}),i190)|" + s"(Long" + s"(${self.i189}),i189)|" + s"(String" + s"(${self.i188}),i188)|" + s"(Int" + s"(${self.i187}),i187)|" + s"(Int" + s"(${self.i186}),i186)|" + s"(Long" + s"(${self.i185}),i185)|" + s"(String" + s"(${self.i184}),i184)|" + s"(Int" + s"(${self.i183}),i183)|" + s"(Int" + s"(${self.i182}),i182)|" + s"(Long" + s"(${self.i181}),i181)|" + s"(String" + s"(${self.i180}),i180)|" + s"(Int" + s"(${self.i179}),i179)|" + s"(Int" + s"(${self.i178}),i178)|" + s"(Long" + s"(${self.i177}),i177)|" + s"(String" + s"(${self.i176}),i176)|" + s"(Int" + s"(${self.i175}),i175)|" + s"(Int" + s"(${self.i174}),i174)|" + s"(Long" + s"(${self.i173}),i173)|" + s"(String" + s"(${self.i172}),i172)|" + s"(Int" + s"(${self.i171}),i171)|" + s"(Int" + s"(${self.i170}),i170)|" + s"(Long" + s"(${self.i169}),i169)|" + s"(String" + s"(${self.i168}),i168)|" + s"(Int" + s"(${self.i167}),i167)|" + s"(Int" + s"(${self.i166}),i166)|" + s"(Long" + s"(${self.i165}),i165)|" + s"(String" + s"(${self.i164}),i164)|" + s"(Int" + s"(${self.i163}),i163)|" + s"(Int" + s"(${self.i162}),i162)|" + s"(Long" + s"(${self.i161}),i161)|" + s"(String" + s"(${self.i160}),i160)|" + s"(Int" + s"(${self.i159}),i159)|" + s"(Int" + s"(${self.i158}),i158)|" + s"(Long" + s"(${self.i157}),i157)|" + s"(String" + s"(${self.i156}),i156)|" + s"(Int" + s"(${self.i155}),i155)|" + s"(Int" + s"(${self.i154}),i154)|" + s"(Long" + s"(${self.i153}),i153)|" + s"(String" + s"(${self.i152}),i152)|" + s"(Int" + s"(${self.i151}),i151)|" + s"(Int" + s"(${self.i150}),i150)|" + s"(Long" + s"(${self.i149}),i149)|" + s"(String" + s"(${self.i148}),i148)|" + s"(Int" + s"(${self.i147}),i147)|" + s"(Int" + s"(${self.i146}),i146)|" + s"(Long" + s"(${self.i145}),i145)|" + s"(String" + s"(${self.i144}),i144)|" + s"(Int" + s"(${self.i143}),i143)|" + s"(Int" + s"(${self.i142}),i142)|" + s"(Long" + s"(${self.i141}),i141)|" + s"(String" + s"(${self.i140}),i140)|" + s"(Int" + s"(${self.i139}),i139)|" + s"(Int" + s"(${self.i138}),i138)|" + s"(Long" + s"(${self.i137}),i137)|" + s"(String" + s"(${self.i136}),i136)|" + s"(Int" + s"(${self.i135}),i135)|" + s"(Int" + s"(${self.i134}),i134)|" + s"(Long" + s"(${self.i133}),i133)|" + s"(String" + s"(${self.i132}),i132)|" + s"(Int" + s"(${self.i131}),i131)|" + s"(Int" + s"(${self.i130}),i130)|" + s"(Long" + s"(${self.i129}),i129)|" + s"(String" + s"(${self.i128}),i128)|" + s"(Int" + s"(${self.i127}),i127)|" + s"(Int" + s"(${self.i126}),i126)|" + s"(Long" + s"(${self.i125}),i125)|" + s"(String" + s"(${self.i124}),i124)|" + s"(Int" + s"(${self.i123}),i123)|" + s"(Int" + s"(${self.i122}),i122)|" + s"(Long" + s"(${self.i121}),i121)|" + s"(String" + s"(${self.i120}),i120)|" + s"(Int" + s"(${self.i119}),i119)|" + s"(Int" + s"(${self.i118}),i118)|" + s"(Long" + s"(${self.i117}),i117)|" + s"(String" + s"(${self.i116}),i116)|" + s"(Int" + s"(${self.i115}),i115)|" + s"(Int" + s"(${self.i114}),i114)|" + s"(Long" + s"(${self.i113}),i113)|" + s"(String" + s"(${self.i112}),i112)|" + s"(Int" + s"(${self.i111}),i111)|" + s"(Int" + s"(${self.i110}),i110)|" + s"(Long" + s"(${self.i109}),i109)|" + s"(String" + s"(${self.i108}),i108)|" + s"(Int" + s"(${self.i107}),i107)|" + s"(Int" + s"(${self.i106}),i106)|" + s"(Long" + s"(${self.i105}),i105)|" + s"(String" + s"(${self.i104}),i104)|" + s"(Int" + s"(${self.i103}),i103)|" + s"(Int" + s"(${self.i102}),i102)|" + s"(Long" + s"(${self.i101}),i101)|" + s"(String" + s"(${self.i100}),i100)|" + s"(Int" + s"(${self.i99}),i99)|" + s"(Int" + s"(${self.i98}),i98)|" + s"(Long" + s"(${self.i97}),i97)|" + s"(String" + s"(${self.i96}),i96)|" + s"(Int" + s"(${self.i95}),i95)|" + s"(Int" + s"(${self.i94}),i94)|" + s"(Long" + s"(${self.i93}),i93)|" + s"(String" + s"(${self.i92}),i92)|" + s"(Int" + s"(${self.i91}),i91)|" + s"(Int" + s"(${self.i90}),i90)|" + s"(Long" + s"(${self.i89}),i89)|" + s"(String" + s"(${self.i88}),i88)|" + s"(Int" + s"(${self.i87}),i87)|" + s"(Int" + s"(${self.i86}),i86)|" + s"(Long" + s"(${self.i85}),i85)|" + s"(String" + s"(${self.i84}),i84)|" + s"(Int" + s"(${self.i83}),i83)|" + s"(Int" + s"(${self.i82}),i82)|" + s"(Long" + s"(${self.i81}),i81)|" + s"(String" + s"(${self.i80}),i80)|" + s"(Int" + s"(${self.i79}),i79)|" + s"(Int" + s"(${self.i78}),i78)|" + s"(Long" + s"(${self.i77}),i77)|" + s"(String" + s"(${self.i76}),i76)|" + s"(Int" + s"(${self.i75}),i75)|" + s"(Int" + s"(${self.i74}),i74)|" + s"(Long" + s"(${self.i73}),i73)|" + s"(String" + s"(${self.i72}),i72)|" + s"(Int" + s"(${self.i71}),i71)|" + s"(Int" + s"(${self.i70}),i70)|" + s"(Long" + s"(${self.i69}),i69)|" + s"(String" + s"(${self.i68}),i68)|" + s"(Int" + s"(${self.i67}),i67)|" + s"(Int" + s"(${self.i66}),i66)|" + s"(Long" + s"(${self.i65}),i65)|" + s"(String" + s"(${self.i64}),i64)|" + s"(Int" + s"(${self.i63}),i63)|" + s"(Int" + s"(${self.i62}),i62)|" + s"(Long" + s"(${self.i61}),i61)|" + s"(String" + s"(${self.i60}),i60)|" + s"(Int" + s"(${self.i59}),i59)|" + s"(Int" + s"(${self.i58}),i58)|" + s"(Long" + s"(${self.i57}),i57)|" + s"(String" + s"(${self.i56}),i56)|" + s"(Int" + s"(${self.i55}),i55)|" + s"(Int" + s"(${self.i54}),i54)|" + s"(Long" + s"(${self.i53}),i53)|" + s"(String" + s"(${self.i52}),i52)|" + s"(Int" + s"(${self.i51}),i51)|" + s"(Int" + s"(${self.i50}),i50)|" + s"(Long" + s"(${self.i49}),i49)|" + s"(String" + s"(${self.i48}),i48)|" + s"(Int" + s"(${self.i47}),i47)|" + s"(Int" + s"(${self.i46}),i46)|" + s"(Long" + s"(${self.i45}),i45)|" + s"(String" + s"(${self.i44}),i44)|" + s"(Int" + s"(${self.i43}),i43)|" + s"(Int" + s"(${self.i42}),i42)|" + s"(Long" + s"(${self.i41}),i41)|" + s"(String" + s"(${self.i40}),i40)|" + s"(Int" + s"(${self.i39}),i39)|" + s"(Int" + s"(${self.i38}),i38)|" + s"(Long" + s"(${self.i37}),i37)|" + s"(String" + s"(${self.i36}),i36)|" + s"(Int" + s"(${self.i35}),i35)|" + s"(Int" + s"(${self.i34}),i34)|" + s"(Long" + s"(${self.i33}),i33)|" + s"(String" + s"(${self.i32}),i32)|" + s"(Int" + s"(${self.i31}),i31)|" + s"(Int" + s"(${self.i30}),i30)|" + s"(Long" + s"(${self.i29}),i29)|" + s"(String" + s"(${self.i28}),i28)|" + s"(Int" + s"(${self.i27}),i27)|" + s"(Int" + s"(${self.i26}),i26)|" + s"(Long" + s"(${self.i25}),i25)|" + s"(String" + s"(${self.i24}),i24)|" + s"(Int" + s"(${self.i23}),i23)|" + s"(Int" + s"(${self.i22}),i22)|" + s"(Long" + s"(${self.i21}),i21)|" + s"(String" + s"(${self.i20}),i20)|" + s"(Int" + s"(${self.i19}),i19)|" + s"(Int" + s"(${self.i18}),i18)|" + s"(Long" + s"(${self.i17}),i17)|" + s"(String" + s"(${self.i16}),i16)|" + s"(Int" + s"(${self.i15}),i15)|" + s"(Int" + s"(${self.i14}),i14)|" + s"(Long" + s"(${self.i13}),i13)|" + s"(String" + s"(${self.i12}),i12)|" + s"(Int" + s"(${self.i11}),i11)|" + s"(Int" + s"(${self.i10}),i10)|" + s"(Long" + s"(${self.i9}),i9)|" + s"(String" + s"(${self.i8}),i8)|" + s"(Int" + s"(${self.i7}),i7)|" + s"(Int" + s"(${self.i6}),i6)|" + s"(Long" + s"(${self.i5}),i5)|" + s"(String" + s"(${self.i4}),i4)|" + s"(Int" + s"(${self.i3}),i3)|" + s"(Int" + s"(${self.i2}),i2)|" + s"(Long" + s"(${self.i1}),i1)"
  }
  val fooValue196 = Foo196(
    i1 = 1,
    i2 = 2,
    i3 = 3,
    i4 = "i4",
    i5 = 5,
    i6 = 6,
    i7 = 7,
    i8 = "i8",
    i9 = 9,
    i10 = 10,
    i11 = 11,
    i12 = "i12",
    i13 = 13,
    i14 = 14,
    i15 = 15,
    i16 = "i16",
    i17 = 17,
    i18 = 18,
    i19 = 19,
    i20 = "i20",
    i21 = 21,
    i22 = 22,
    i23 = 23,
    i24 = "i24",
    i25 = 25,
    i26 = 26,
    i27 = 27,
    i28 = "i28",
    i29 = 29,
    i30 = 30,
    i31 = 31,
    i32 = "i32",
    i33 = 33,
    i34 = 34,
    i35 = 35,
    i36 = "i36",
    i37 = 37,
    i38 = 38,
    i39 = 39,
    i40 = "i40",
    i41 = 41,
    i42 = 42,
    i43 = 43,
    i44 = "i44",
    i45 = 45,
    i46 = 46,
    i47 = 47,
    i48 = "i48",
    i49 = 49,
    i50 = 50,
    i51 = 51,
    i52 = "i52",
    i53 = 53,
    i54 = 54,
    i55 = 55,
    i56 = "i56",
    i57 = 57,
    i58 = 58,
    i59 = 59,
    i60 = "i60",
    i61 = 61,
    i62 = 62,
    i63 = 63,
    i64 = "i64",
    i65 = 65,
    i66 = 66,
    i67 = 67,
    i68 = "i68",
    i69 = 69,
    i70 = 70,
    i71 = 71,
    i72 = "i72",
    i73 = 73,
    i74 = 74,
    i75 = 75,
    i76 = "i76",
    i77 = 77,
    i78 = 78,
    i79 = 79,
    i80 = "i80",
    i81 = 81,
    i82 = 82,
    i83 = 83,
    i84 = "i84",
    i85 = 85,
    i86 = 86,
    i87 = 87,
    i88 = "i88",
    i89 = 89,
    i90 = 90,
    i91 = 91,
    i92 = "i92",
    i93 = 93,
    i94 = 94,
    i95 = 95,
    i96 = "i96",
    i97 = 97,
    i98 = 98,
    i99 = 99,
    i100 = "i100",
    i101 = 101,
    i102 = 102,
    i103 = 103,
    i104 = "i104",
    i105 = 105,
    i106 = 106,
    i107 = 107,
    i108 = "i108",
    i109 = 109,
    i110 = 110,
    i111 = 111,
    i112 = "i112",
    i113 = 113,
    i114 = 114,
    i115 = 115,
    i116 = "i116",
    i117 = 117,
    i118 = 118,
    i119 = 119,
    i120 = "i120",
    i121 = 121,
    i122 = 122,
    i123 = 123,
    i124 = "i124",
    i125 = 125,
    i126 = 126,
    i127 = 127,
    i128 = "i128",
    i129 = 129,
    i130 = 130,
    i131 = 131,
    i132 = "i132",
    i133 = 133,
    i134 = 134,
    i135 = 135,
    i136 = "i136",
    i137 = 137,
    i138 = 138,
    i139 = 139,
    i140 = "i140",
    i141 = 141,
    i142 = 142,
    i143 = 143,
    i144 = "i144",
    i145 = 145,
    i146 = 146,
    i147 = 147,
    i148 = "i148",
    i149 = 149,
    i150 = 150,
    i151 = 151,
    i152 = "i152",
    i153 = 153,
    i154 = 154,
    i155 = 155,
    i156 = "i156",
    i157 = 157,
    i158 = 158,
    i159 = 159,
    i160 = "i160",
    i161 = 161,
    i162 = 162,
    i163 = 163,
    i164 = "i164",
    i165 = 165,
    i166 = 166,
    i167 = 167,
    i168 = "i168",
    i169 = 169,
    i170 = 170,
    i171 = 171,
    i172 = "i172",
    i173 = 173,
    i174 = 174,
    i175 = 175,
    i176 = "i176",
    i177 = 177,
    i178 = 178,
    i179 = 179,
    i180 = "i180",
    i181 = 181,
    i182 = 182,
    i183 = 183,
    i184 = "i184",
    i185 = 185,
    i186 = 186,
    i187 = 187,
    i188 = "i188",
    i189 = 189,
    i190 = 190,
    i191 = 191,
    i192 = "i192",
    i193 = 193,
    i194 = 194,
    i195 = 195,
    i196 = "i196"
  )
  val ap196 = PropertyApply[Foo196]
  import in._
  import out._
  val fooEncoder196: ListEncoder[Foo196]         = encoder
  val reverseFooEncoder196: ListEncoder[Foo196]  = reverseEncoder
  val fooDecoder196: ModelDecoder[Foo196]        = decoder
  val reverseFooDecoder196: ModelDecoder[Foo196] = reverseDecoder
  describe("A case class by 196 length") {
    it("should generic to a encoder") {
      val str1 = fooEncoder196.encode(fooValue196).mkString("|")
      str1 shouldBe fooValue196.toString
    }
    it("should generic to a reverse encoder") {
      val str2 = reverseFooEncoder196.encode(fooValue196).mkString("|")
      str2 shouldBe fooValue196.reverseString
    }
    it("should generic to a decoder") {
      val (_, model1) = fooDecoder196.getData(fooValue196.toString)
      model1 shouldBe fooValue196
    }
    it("should generic to a reverse decoder") {
      val (_, model2) = reverseFooDecoder196.getData(fooValue196.reverseString)
      model2 shouldBe fooValue196
    }
  }
}
