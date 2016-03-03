<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="DDSM2TOSCA"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchStormSupervisorRule():V"/>
		<constant value="A.__matchStormNimbusRule():V"/>
		<constant value="A.__matchMediumHostRule():V"/>
		<constant value="__exec__"/>
		<constant value="StormSupervisorRule"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyStormSupervisorRule(NTransientLink;):V"/>
		<constant value="StormNimbusRule"/>
		<constant value="A.__applyStormNimbusRule(NTransientLink;):V"/>
		<constant value="MediumHostRule"/>
		<constant value="A.__applyMediumHostRule(NTransientLink;):V"/>
		<constant value="__matchStormSupervisorRule"/>
		<constant value="StormSupervisor"/>
		<constant value="DDSM"/>
		<constant value="ddsm"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="s"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="t"/>
		<constant value="Node_template"/>
		<constant value="TOSCA"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="11:3-14:5"/>
		<constant value="__applyStormSupervisorRule"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="node_template_name"/>
		<constant value="dice.storm"/>
		<constant value="type"/>
		<constant value="12:26-12:27"/>
		<constant value="12:26-12:32"/>
		<constant value="12:4-12:32"/>
		<constant value="13:12-13:24"/>
		<constant value="13:4-13:24"/>
		<constant value="link"/>
		<constant value="__matchStormNimbusRule"/>
		<constant value="StormNimbus"/>
		<constant value="21:3-24:5"/>
		<constant value="__applyStormNimbusRule"/>
		<constant value="dice.nimbus"/>
		<constant value="22:26-22:27"/>
		<constant value="22:26-22:32"/>
		<constant value="22:4-22:32"/>
		<constant value="23:12-23:25"/>
		<constant value="23:4-23:25"/>
		<constant value="__matchMediumHostRule"/>
		<constant value="MediumHost"/>
		<constant value="31:3-34:5"/>
		<constant value="__applyMediumHostRule"/>
		<constant value="dice.mediumHost"/>
		<constant value="32:26-32:27"/>
		<constant value="32:26-32:32"/>
		<constant value="32:4-32:32"/>
		<constant value="33:12-33:29"/>
		<constant value="33:4-33:29"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
			<getasm/>
			<pcall arg="41"/>
			<getasm/>
			<pcall arg="42"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="5"/>
		</localvariabletable>
	</operation>
	<operation name="43">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="44"/>
			<call arg="45"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="46"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="47"/>
			<call arg="45"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="48"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="49"/>
			<call arg="45"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="50"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="1" name="33" begin="25" end="28"/>
			<lve slot="0" name="17" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="51">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="52"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="56"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="44"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="58"/>
			<load arg="19"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="60"/>
			<push arg="61"/>
			<push arg="62"/>
			<new/>
			<pcall arg="63"/>
			<pusht/>
			<pcall arg="64"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="65" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="58" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="66">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="67"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="58"/>
			<call arg="68"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="60"/>
			<call arg="69"/>
			<store arg="70"/>
			<load arg="70"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="71"/>
			<dup/>
			<getasm/>
			<push arg="72"/>
			<call arg="30"/>
			<set arg="73"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="74" begin="11" end="11"/>
			<lne id="75" begin="11" end="12"/>
			<lne id="76" begin="9" end="14"/>
			<lne id="77" begin="17" end="17"/>
			<lne id="78" begin="15" end="19"/>
			<lne id="65" begin="8" end="20"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="60" begin="7" end="20"/>
			<lve slot="2" name="58" begin="3" end="20"/>
			<lve slot="0" name="17" begin="0" end="20"/>
			<lve slot="1" name="79" begin="0" end="20"/>
		</localvariabletable>
	</operation>
	<operation name="80">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="81"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="56"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="47"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="58"/>
			<load arg="19"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="60"/>
			<push arg="61"/>
			<push arg="62"/>
			<new/>
			<pcall arg="63"/>
			<pusht/>
			<pcall arg="64"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="82" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="58" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="83">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="67"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="58"/>
			<call arg="68"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="60"/>
			<call arg="69"/>
			<store arg="70"/>
			<load arg="70"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="71"/>
			<dup/>
			<getasm/>
			<push arg="84"/>
			<call arg="30"/>
			<set arg="73"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="85" begin="11" end="11"/>
			<lne id="86" begin="11" end="12"/>
			<lne id="87" begin="9" end="14"/>
			<lne id="88" begin="17" end="17"/>
			<lne id="89" begin="15" end="19"/>
			<lne id="82" begin="8" end="20"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="60" begin="7" end="20"/>
			<lve slot="2" name="58" begin="3" end="20"/>
			<lve slot="0" name="17" begin="0" end="20"/>
			<lve slot="1" name="79" begin="0" end="20"/>
		</localvariabletable>
	</operation>
	<operation name="90">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="91"/>
			<push arg="53"/>
			<findme/>
			<push arg="54"/>
			<call arg="55"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="56"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="49"/>
			<pcall arg="57"/>
			<dup/>
			<push arg="58"/>
			<load arg="19"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="60"/>
			<push arg="61"/>
			<push arg="62"/>
			<new/>
			<pcall arg="63"/>
			<pusht/>
			<pcall arg="64"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="92" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="58" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="93">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="67"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="58"/>
			<call arg="68"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="60"/>
			<call arg="69"/>
			<store arg="70"/>
			<load arg="70"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="71"/>
			<dup/>
			<getasm/>
			<push arg="94"/>
			<call arg="30"/>
			<set arg="73"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="95" begin="11" end="11"/>
			<lne id="96" begin="11" end="12"/>
			<lne id="97" begin="9" end="14"/>
			<lne id="98" begin="17" end="17"/>
			<lne id="99" begin="15" end="19"/>
			<lne id="92" begin="8" end="20"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="60" begin="7" end="20"/>
			<lve slot="2" name="58" begin="3" end="20"/>
			<lve slot="0" name="17" begin="0" end="20"/>
			<lve slot="1" name="79" begin="0" end="20"/>
		</localvariabletable>
	</operation>
</asm>
