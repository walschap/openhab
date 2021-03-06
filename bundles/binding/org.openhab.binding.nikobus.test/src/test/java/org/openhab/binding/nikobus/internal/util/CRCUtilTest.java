/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.nikobus.internal.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Davy Vanherbergen
 * @since 1.3.0
 */
public class CRCUtilTest {

    @Test
    public void canAppendCRC() {

        assertEquals("156C94FF0000FFFF00FF0AF3", CRCUtil.appendCRC("156C94FF0000FFFF00FF"));
        assertEquals("16D3C30000000000FFFF46EA", CRCUtil.appendCRC("16D3C30000000000FFFF"));
        assertEquals("15D3C3FF0000000000FF51AB", CRCUtil.appendCRC("15D3C3FF0000000000FF"));
        assertEquals("15D3C3FF0000000000FF51AB", CRCUtil.appendCRC("15d3c3ff0000000000ff"));
        assertEquals("15D3C300FF00000000FFA065", CRCUtil.appendCRC("15D3C300FF00000000FF"));
        assertEquals("15D3C30000FF000000FFAE75", CRCUtil.appendCRC("15D3C30000FF000000FF"));
        assertEquals("15D3C3000000FF0000FFBF79", CRCUtil.appendCRC("15D3C3000000FF0000FF"));
        assertEquals("15D3C3000000FF0000FFBF79", CRCUtil.appendCRC("15D3C3000000FF0000FF"));
        assertEquals("15D3C300000000FF00FF3BB9", CRCUtil.appendCRC("15D3C300000000FF00FF"));
        assertEquals("15D3C30000000000FFFFF725", CRCUtil.appendCRC("15D3C30000000000FFFF"));
        assertEquals("16D3C3FF0000000000FFE064", CRCUtil.appendCRC("16D3C3FF0000000000FF"));
        assertEquals("16D3C300FF00000000FF11AA", CRCUtil.appendCRC("16D3C300FF00000000FF"));
        assertEquals("16D3C30000FF000000FF1FBA", CRCUtil.appendCRC("16D3C30000FF000000FF"));
        assertEquals("16D3C30000000000FFFF46EA", CRCUtil.appendCRC("16D3C30000000000FFFF"));
        assertEquals("16D3C300000000FF00FF8A76", CRCUtil.appendCRC("16D3C300000000FF00FF"));
        assertEquals("126C946CE5", CRCUtil.appendCRC("126C94"));
    }

    @Test
    public void canAppendCRC2() {

        assertEquals("$1E156C94FF00000000FFFF8DCCDE", CRCUtil.appendCRC2("$1E156C94FF00000000FFFF8DCC"));
        assertEquals("$1E154498FF0000FF0000FF5A24A8", CRCUtil.appendCRC2("$1E154498FF0000FF0000FF5A24"));
        assertEquals("$1E161CC1000000FFFF00FF364C25", CRCUtil.appendCRC2("$1E161CC1000000FFFF00FF364C"));
        assertEquals("$1E156C94000000FFFFFFFFAC7DD0", CRCUtil.appendCRC2("$1E156C94000000FFFFFFFFAC7D"));
        assertEquals("$1E16449800FF00FF0000FF1A25B0", CRCUtil.appendCRC2("$1E16449800FF00FF0000FF1A25"));
        assertEquals("$1E164498FF0000FF0000FFEBEB35", CRCUtil.appendCRC2("$1E164498FF0000FF0000FFEBEB"));
        assertEquals("$1E161CC1FF0000FF0000FF5C5E11", CRCUtil.appendCRC2("$1E161CC1FF0000FF0000FF5C5E"));
        assertEquals("$1E151CC100FFFF0000FFFF0EACBE", CRCUtil.appendCRC2("$1E151CC100FFFF0000FFFF0EAC"));
        assertEquals("$1E156C940000FFFFFF00FFF52D60", CRCUtil.appendCRC2("$1E156C940000FFFFFF00FFF52D"));
        assertEquals("$1E151CC1FF00FFFF0000FFB73E63", CRCUtil.appendCRC2("$1E151CC1FF00FFFF0000FFB73E"));
        assertEquals("$1E156C940000FFFF00FFFF39B197", CRCUtil.appendCRC2("$1E156C940000FFFF00FFFF39B1"));
        assertEquals("$1E161CC1FF0000FFFFFFFF90C2B9", CRCUtil.appendCRC2("$1E161CC1FF0000FFFFFFFF90C2"));
        assertEquals("$1E151CC10000000000FFFF00BCBA", CRCUtil.appendCRC2("$1E151CC10000000000FFFF00BC"));
        assertEquals("$1E156C94FF0000FFFFFFFF090C7D", CRCUtil.appendCRC2("$1E156C94FF0000FFFFFFFF090C"));
        assertEquals("$1E151CC1FFFFFF00FF00FF67411F", CRCUtil.appendCRC2("$1E151CC1FFFFFF00FF00FF6741"));
        assertEquals("$1E161CC1000000FFFFFFFF35B3EF", CRCUtil.appendCRC2("$1E161CC1000000FFFFFFFF35B3"));
        assertEquals("$1E164498FF0000000000FFA0488A", CRCUtil.appendCRC2("$1E164498FF0000000000FFA048"));
        assertEquals("$1E151CC1FFFF00FF0000FFB92EAB", CRCUtil.appendCRC2("$1E151CC1FFFF00FF0000FFB92E"));
        assertEquals("$1E161CC100FF00FFFF00FF62F3A0", CRCUtil.appendCRC2("$1E161CC100FF00FFFF00FF62F3"));
        assertEquals("$1E15449800FFFFFFFFFFFF3DD975", CRCUtil.appendCRC2("$1E15449800FFFFFFFFFFFF3DD9"));
        assertEquals("$1E166C94FF00FFFFFFFFFFE26C38", CRCUtil.appendCRC2("$1E166C94FF00FFFFFFFFFFE26C"));
        assertEquals("$1E151CC100000000FFFFFFCFDF07", CRCUtil.appendCRC2("$1E151CC100000000FFFFFFCFDF"));
        assertEquals("$1E1644980000000000FFFF06C6EE", CRCUtil.appendCRC2("$1E1644980000000000FFFF06C6"));
        assertEquals("$1E164498FF00FFFF00FFFFB2BBBD", CRCUtil.appendCRC2("$1E164498FF00FFFF00FFFFB2BB"));
        assertEquals("$1E154498000000FF00FFFFFCAAC3", CRCUtil.appendCRC2("$1E154498000000FF00FFFFFCAA"));
        assertEquals("$1E166C94000000000000FF9A8D03", CRCUtil.appendCRC2("$1E166C94000000000000FF9A8D"));
        assertEquals("$1E151CC1FF00FFFFFFFFFF7BA25B", CRCUtil.appendCRC2("$1E151CC1FF00FFFFFFFFFF7BA2"));
        assertEquals("$1E166C9400FFFF0000FFFF97625D", CRCUtil.appendCRC2("$1E166C9400FFFF0000FFFF9762"));
        assertEquals("$1E161CC100FF00FF00FFFFAE6FA9", CRCUtil.appendCRC2("$1E161CC100FF00FF00FFFFAE6F"));
        assertEquals("$1E1644980000FF00FFFFFF930A9D", CRCUtil.appendCRC2("$1E1644980000FF00FFFFFF930A"));
        assertEquals("$1E166C940000FF000000FFC022EC", CRCUtil.appendCRC2("$1E166C940000FF000000FFC022"));
        assertEquals("$1E154498FFFFFF00FFFFFFD30B6D", CRCUtil.appendCRC2("$1E154498FFFFFF00FFFFFFD30B"));
        assertEquals("$1E151CC100FF0000FFFFFF9B6018", CRCUtil.appendCRC2("$1E151CC100FF0000FFFFFF9B60"));
        assertEquals("$1E1544980000000000FFFFB709B6", CRCUtil.appendCRC2("$1E1544980000000000FFFFB709"));
        assertEquals("$1E151CC10000FF000000FF59EC64", CRCUtil.appendCRC2("$1E151CC10000FF000000FF59EC"));
        assertEquals("$1E156C9400FFFF0000FFFF26AD40", CRCUtil.appendCRC2("$1E156C9400FFFF0000FFFF26AD"));
        assertEquals("$1E166C94000000FFFF00FF1E4DDB", CRCUtil.appendCRC2("$1E166C94000000FFFF00FF1E4D"));
        assertEquals("$1E161CC100FF0000FFFFFF2AAFAD", CRCUtil.appendCRC2("$1E161CC100FF0000FFFFFF2AAF"));
        assertEquals("$10174498C9D612", CRCUtil.appendCRC2("$10174498C9D6"));
        assertEquals("$1E164498FF0000FFFF00FF24887A", CRCUtil.appendCRC2("$1E164498FF0000FFFF00FF2488"));
        assertEquals("$1E166C94FFFFFFFF00FFFF79B08F", CRCUtil.appendCRC2("$1E166C94FFFFFFFF00FFFF79B0"));
        assertEquals("$1E151CC100FFFFFFFFFFFF8A6C92", CRCUtil.appendCRC2("$1E151CC100FFFFFFFFFFFF8A6C"));
        assertEquals("$1E166C9400000000FF00FF55EED3", CRCUtil.appendCRC2("$1E166C9400000000FF00FF55EE"));
        assertEquals("$1E151CC1FFFFFF0000FFFFABDDBE", CRCUtil.appendCRC2("$1E151CC1FFFFFF0000FFFFABDD"));
        assertEquals("$1E151CC1FFFF0000FFFFFF3E110D", CRCUtil.appendCRC2("$1E151CC1FFFF0000FFFFFF3E11"));
        assertEquals("$1E151CC100FF00FF00FFFF1FA034", CRCUtil.appendCRC2("$1E151CC100FF00FF00FFFF1FA0"));
        assertEquals("$1E156C9400FFFFFFFF00FFA19247", CRCUtil.appendCRC2("$1E156C9400FFFFFFFF00FFA192"));
        assertEquals("$1E156C940000FF000000FF71ED0F", CRCUtil.appendCRC2("$1E156C940000FF000000FF71ED"));
        assertEquals("$1E164498FFFF0000FF00FF3B947D", CRCUtil.appendCRC2("$1E164498FFFF0000FF00FF3B94"));
        assertEquals("$1E154498FFFFFFFFFFFFFF98A8AC", CRCUtil.appendCRC2("$1E154498FFFFFFFFFFFFFF98A8"));
        assertEquals("$1E151CC1000000FF0000FF48E046", CRCUtil.appendCRC2("$1E151CC1000000FF0000FF48E0"));
        assertEquals("$1E166C94FFFFFFFFFFFFFFB6D3D6", CRCUtil.appendCRC2("$1E166C94FFFFFFFFFFFFFFB6D3"));
        assertEquals("$1E166C94FFFFFF000000FF31EC73", CRCUtil.appendCRC2("$1E166C94FFFFFF000000FF31EC"));
        assertEquals("$1E151CC1FF0000FFFFFFFF210D16", CRCUtil.appendCRC2("$1E151CC1FF0000FFFFFFFF210D"));
        assertEquals("$1E154498000000FF0000FFFF55FE", CRCUtil.appendCRC2("$1E154498000000FF0000FFFF55"));
        assertEquals("$1E161CC100000000FFFFFF7E1015", CRCUtil.appendCRC2("$1E161CC100000000FFFFFF7E10"));
        assertEquals("$1E166C9400FFFFFF00FFFFDCC1C6", CRCUtil.appendCRC2("$1E166C9400FFFFFF00FFFFDCC1"));
        assertEquals("$1E156C94FFFF00000000FFDA8C3C", CRCUtil.appendCRC2("$1E156C94FFFF00000000FFDA8C"));
        assertEquals("$1E156C9400FF00FF00FFFF37A106", CRCUtil.appendCRC2("$1E156C9400FF00FF00FFFF37A1"));
        assertEquals("$1E154498000000FFFFFFFF33C96B", CRCUtil.appendCRC2("$1E154498000000FFFFFFFF33C9"));
        assertEquals("$1E156C9400FFFF00FFFFFFE9CE6B", CRCUtil.appendCRC2("$1E156C9400FFFF00FFFFFFE9CE"));
        assertEquals("$1E166C9400FF00000000FFCE32B1", CRCUtil.appendCRC2("$1E166C9400FF00000000FFCE32"));
        assertEquals("$1E151CC1FFFF00FFFFFFFF75B2F7", CRCUtil.appendCRC2("$1E151CC1FFFF00FFFFFFFF75B2"));
        assertEquals("$1E156C94FFFF00FF0000FF912F4C", CRCUtil.appendCRC2("$1E156C94FFFF00FF0000FF912F"));
        assertEquals("$1E154498FFFF00FFFF00FFC1F88C", CRCUtil.appendCRC2("$1E154498FFFF00FFFF00FFC1F8"));
        assertEquals("$1E15449800FF000000FFFFE3B688", CRCUtil.appendCRC2("$1E15449800FF000000FFFFE3B6"));
        assertEquals("$1E16449800FF00FF00FFFF19DA20", CRCUtil.appendCRC2("$1E16449800FF00FF00FFFF19DA"));
        assertEquals("$1E156C94FFFFFFFFFFFFFF071CB5", CRCUtil.appendCRC2("$1E156C94FFFFFFFFFFFFFF071C"));
        assertEquals("$1E1644980000FFFFFFFFFFD8A9F7", CRCUtil.appendCRC2("$1E1644980000FFFFFFFFFFD8A9"));
        assertEquals("$1E166C94FF00FF0000FFFF66AC3C", CRCUtil.appendCRC2("$1E166C94FF00FF0000FFFF66AC"));
        assertEquals("$101244982226F2", CRCUtil.appendCRC2("$101244982226"));
        assertEquals("$1E161CC100FFFF00FFFFFF700048", CRCUtil.appendCRC2("$1E161CC100FFFF00FFFFFF7000"));
        assertEquals("$1E161CC100FFFFFF0000FFF73FD0", CRCUtil.appendCRC2("$1E161CC100FFFFFF0000FFF73F"));
        assertEquals("$1E164498FFFFFF0000FFFFADA73C", CRCUtil.appendCRC2("$1E164498FFFFFF0000FFFFADA7"));
        assertEquals("$1E151CC1FF00FF000000FFFC9D56", CRCUtil.appendCRC2("$1E151CC1FF00FF000000FFFC9D"));
        assertEquals("$1E151CC10000FF00FFFFFF9570ED", CRCUtil.appendCRC2("$1E151CC10000FF00FFFFFF9570"));
        assertEquals("$1E156C9400000000FFFFFFE7DE48", CRCUtil.appendCRC2("$1E156C9400000000FFFFFFE7DE"));
        assertEquals("$1E151CC1FFFF000000FFFFF172C1", CRCUtil.appendCRC2("$1E151CC1FFFF000000FFFFF172"));
        assertEquals("$1E161CC1FFFF00FFFF00FFC7824E", CRCUtil.appendCRC2("$1E161CC1FFFF00FFFF00FFC782"));
        assertEquals("$1E164498FF00FF00FF00FF358488", CRCUtil.appendCRC2("$1E164498FF00FF00FF00FF3584"));
        assertEquals("$1E151CC1FF0000FF0000FFED911A", CRCUtil.appendCRC2("$1E151CC1FF0000FF0000FFED91"));
        assertEquals("$1E161CC10000FF000000FFE82335", CRCUtil.appendCRC2("$1E161CC10000FF000000FFE823"));
        assertEquals("$1E151CC1FF0000000000FFA632E5", CRCUtil.appendCRC2("$1E151CC1FF0000000000FFA632"));
        assertEquals("$1E151CC1FF0000FFFF00FF22F2B8", CRCUtil.appendCRC2("$1E151CC1FF0000FFFF00FF22F2"));
        assertEquals("$1E154498FFFFFF0000FFFF1C68DC", CRCUtil.appendCRC2("$1E154498FFFFFF0000FFFF1C68"));
        assertEquals("$1E166C9400FF00FF00FFFF866EB0", CRCUtil.appendCRC2("$1E166C9400FF00FF00FFFF866E"));
        assertEquals("$1E156C94FFFFFF000000FF80230A", CRCUtil.appendCRC2("$1E156C94FFFFFF000000FF8023"));
        assertEquals("$1E164498FFFFFF000000FFAE58D7", CRCUtil.appendCRC2("$1E164498FFFFFF000000FFAE58"));
        assertEquals("$1E154498FF00FF00FFFFFF87B4CF", CRCUtil.appendCRC2("$1E154498FF00FF00FFFFFF87B4"));
        assertEquals("$1E161CC1FFFF00FFFFFFFFC47D4D", CRCUtil.appendCRC2("$1E161CC1FFFF00FFFFFFFFC47D"));
        assertEquals("$10126C946CE5A0", CRCUtil.appendCRC2("$10126C946CE5"));
        assertEquals("$1E166C94FFFF00FF0000FF20E051", CRCUtil.appendCRC2("$1E166C94FFFF00FF0000FF20E0"));
        assertEquals("$1E151CC100FFFF00FFFFFFC1CF19", CRCUtil.appendCRC2("$1E151CC100FFFF00FFFFFFC1CF"));
        assertEquals("$1E161CC1000000000000FFB28CBE", CRCUtil.appendCRC2("$1E161CC1000000000000FFB28C"));
        assertEquals("$1E154498FF00000000FFFF127848", CRCUtil.appendCRC2("$1E154498FF00000000FFFF1278"));
        assertEquals("$1E164498000000FFFFFFFF820670", CRCUtil.appendCRC2("$1E164498000000FFFFFFFF8206"));
        assertEquals("$1E156C94FF00FF00FF00FF1BFFCC", CRCUtil.appendCRC2("$1E156C94FF00FF00FF00FF1BFF"));
        assertEquals("$1E156C9400000000FF00FFE4214D", CRCUtil.appendCRC2("$1E156C9400000000FF00FFE421"));
        assertEquals("$1E164498FFFFFFFF0000FFE5FB99", CRCUtil.appendCRC2("$1E164498FFFFFFFF0000FFE5FB"));
        assertEquals("$1E16449800FF00000000FF5186E7", CRCUtil.appendCRC2("$1E16449800FF00000000FF5186"));
        assertEquals("$10176C948715BB", CRCUtil.appendCRC2("$10176C948715"));
        assertEquals("$1E16449800000000FF00FFCA5A71", CRCUtil.appendCRC2("$1E16449800000000FF00FFCA5A"));
        assertEquals("$1E156C94FF00FFFFFFFFFF53A369", CRCUtil.appendCRC2("$1E156C94FF00FFFFFFFFFF53A3"));
        assertEquals("$1E154498000000000000FFB4F6AC", CRCUtil.appendCRC2("$1E154498000000000000FFB4F6"));
        assertEquals("$1E166C94FFFFFFFF0000FF7A4FB4", CRCUtil.appendCRC2("$1E166C94FFFFFFFF0000FF7A4F"));
        assertEquals("$1E16449800FF00FFFFFFFFD6B966", CRCUtil.appendCRC2("$1E16449800FF00FFFFFFFFD6B9"));
        assertEquals("$1E151CC1FFFFFF000000FFA8222D", CRCUtil.appendCRC2("$1E151CC1FFFFFF000000FFA822"));
        assertEquals("$1E151CC1FF000000FFFFFF6AAE1E", CRCUtil.appendCRC2("$1E151CC1FF000000FFFFFF6AAE"));
        assertEquals("$1E156C94FF00FF000000FFD49C61", CRCUtil.appendCRC2("$1E156C94FF00FF000000FFD49C"));
        assertEquals("$1E154498FF0000FF00FFFF59DB93", CRCUtil.appendCRC2("$1E154498FF0000FF00FFFF59DB"));
        assertEquals("$1E156C94FF00FFFFFF00FF505CFA", CRCUtil.appendCRC2("$1E156C94FF00FFFFFF00FF505C"));
        assertEquals("$1E156C94FF0000FF00FFFFC66FFD", CRCUtil.appendCRC2("$1E156C94FF0000FF00FFFFC66F"));
        assertEquals("$1E154498FFFFFFFF00FFFF57CBB0", CRCUtil.appendCRC2("$1E154498FFFFFFFF00FFFF57CB"));
        assertEquals("$1E151CC1FFFFFFFF00FFFFE07E47", CRCUtil.appendCRC2("$1E151CC1FFFFFFFF00FFFFE07E"));
        assertEquals("$1E1644980000FF000000FF5F9612", CRCUtil.appendCRC2("$1E1644980000FF000000FF5F96"));
        assertEquals("$1E161CC100FF00000000FFE633FD", CRCUtil.appendCRC2("$1E161CC100FF00000000FFE633"));
        assertEquals("$1E15449800FFFF000000FFBAE6A8", CRCUtil.appendCRC2("$1E15449800FFFF000000FFBAE6"));
        assertEquals("$1E166C94FF0000FFFF00FFBB3CE9", CRCUtil.appendCRC2("$1E166C94FF0000FFFF00FFBB3C"));
        assertEquals("$1E154498FFFFFF00FF00FFD0F4C3", CRCUtil.appendCRC2("$1E154498FFFFFF00FF00FFD0F4"));
        assertEquals("$1E161CC1FFFFFFFF0000FF524E85", CRCUtil.appendCRC2("$1E161CC1FFFFFFFF0000FF524E"));
        assertEquals("$1E164498FF0000FF00FFFFE814FF", CRCUtil.appendCRC2("$1E164498FF0000FF00FFFFE814"));
        assertEquals("$1E154498FF00FF00FF00FF844B61", CRCUtil.appendCRC2("$1E154498FF00FF00FF00FF844B"));
        assertEquals("$1E166C94FF0000000000FF3FFCDF", CRCUtil.appendCRC2("$1E166C94FF0000000000FF3FFC"));
        assertEquals("$1E154498FF0000FFFFFFFF96B83D", CRCUtil.appendCRC2("$1E154498FF0000FFFFFFFF96B8"));
        assertEquals("$1E166C9400FFFFFFFF00FF105D86", CRCUtil.appendCRC2("$1E166C9400FFFFFFFF00FF105D"));
        assertEquals("$1E151CC1FFFFFF00FFFFFF64BE1A", CRCUtil.appendCRC2("$1E151CC1FFFFFF00FFFFFF64BE"));
        assertEquals("$1E15449800FF00FFFFFFFF6776D5", CRCUtil.appendCRC2("$1E15449800FF00FFFFFFFF6776"));
        assertEquals("$1E156C94000000000000FF2B4242", CRCUtil.appendCRC2("$1E156C94000000000000FF2B42"));
        assertEquals("$1E166C9400FF0000FFFFFF02AE9C", CRCUtil.appendCRC2("$1E166C9400FF0000FFFFFF02AE"));
        assertEquals("$1E166C9400FF0000FF00FF0151C0", CRCUtil.appendCRC2("$1E166C9400FF0000FF00FF0151"));
        assertEquals("$1E164498FFFF00FFFF00FF703782", CRCUtil.appendCRC2("$1E164498FFFF00FFFF00FF7037"));
        assertEquals("$1E151CC1000000FFFFFFFF847CCF", CRCUtil.appendCRC2("$1E151CC1000000FFFFFFFF847C"));
        assertEquals("$1E161CC100FFFFFFFFFFFF3BA343", CRCUtil.appendCRC2("$1E161CC100FFFFFFFFFFFF3BA3"));
        assertEquals("$1E1644980000FF00FF00FF90F598", CRCUtil.appendCRC2("$1E1644980000FF00FF00FF90F5"));
        assertEquals("$1E151CC100FF00FF0000FF1C5FA2", CRCUtil.appendCRC2("$1E151CC100FF00FF0000FF1C5F"));
        assertEquals("$1E164498FF000000FFFFFF6CD4FE", CRCUtil.appendCRC2("$1E164498FF000000FFFFFF6CD4"));
        assertEquals("$1E166C94FF0000FF0000FF745FE9", CRCUtil.appendCRC2("$1E166C94FF0000FF0000FF745F"));
        assertEquals("$1E166C940000FFFFFFFFFF471DC9", CRCUtil.appendCRC2("$1E166C940000FFFFFFFFFF471D"));
        assertEquals("$1E161CC1FFFF0000FFFFFF8FDE4A", CRCUtil.appendCRC2("$1E161CC1FFFF0000FFFFFF8FDE"));
        assertEquals("$1E156C94FFFF0000FF00FF15EF60", CRCUtil.appendCRC2("$1E156C94FFFF0000FF00FF15EF"));
        assertEquals("$1E154498000000FFFF00FF30369A", CRCUtil.appendCRC2("$1E154498000000FFFF00FF3036"));
        assertEquals("$1E154498FF00FFFF00FFFF0374BA", CRCUtil.appendCRC2("$1E154498FF00FFFF00FFFF0374"));
        assertEquals("$1E156C94FFFF000000FFFFD973CE", CRCUtil.appendCRC2("$1E156C94FFFF000000FFFFD973"));
        assertEquals("$1E161CC1FF0000FFFF00FF933DFC", CRCUtil.appendCRC2("$1E161CC1FF0000FFFF00FF933D"));
        assertEquals("$1E15449800FF00FF00FFFFA815E7", CRCUtil.appendCRC2("$1E15449800FF00FF00FFFFA815"));
        assertEquals("$1E161CC10000000000FFFFB173D9", CRCUtil.appendCRC2("$1E161CC10000000000FFFFB173"));
        assertEquals("$1E161CC1FF00FF00FFFFFF81CE54", CRCUtil.appendCRC2("$1E161CC1FF00FF00FFFFFF81CE"));
        assertEquals("$1E166C940000FF00FF00FF0F4135", CRCUtil.appendCRC2("$1E166C940000FF00FF00FF0F41"));
        assertEquals("$1E151CC100FFFFFF00FFFF450F79", CRCUtil.appendCRC2("$1E151CC100FFFFFF00FFFF450F"));
        assertEquals("$1E15449800FFFFFF00FFFFF2BA0E", CRCUtil.appendCRC2("$1E15449800FFFFFF00FFFFF2BA"));
        assertEquals("$1E156C94FFFF00FF00FFFF92D0E2", CRCUtil.appendCRC2("$1E156C94FFFF00FF00FFFF92D0"));
        assertEquals("$1E156C940000FF00FF00FFBE8E9C", CRCUtil.appendCRC2("$1E156C940000FF00FF00FFBE8E"));
        assertEquals("$1E1644980000FF0000FFFF5C69C4", CRCUtil.appendCRC2("$1E1644980000FF0000FFFF5C69"));
        assertEquals("$1E166C94FF00FFFF0000FF2EF055", CRCUtil.appendCRC2("$1E166C94FF00FFFF0000FF2EF0"));
        assertEquals("$1E161CC100FFFFFF00FFFFF4C095", CRCUtil.appendCRC2("$1E161CC100FFFFFF00FFFFF4C0"));
        assertEquals("$1E156C94FF00FFFF0000FF9F3FB9", CRCUtil.appendCRC2("$1E156C94FF00FFFF0000FF9F3F"));
        assertEquals("$1E15449800000000FFFFFF786AF0", CRCUtil.appendCRC2("$1E15449800000000FFFFFF786A"));
        assertEquals("$1E166C9400FFFF000000FF949D5E", CRCUtil.appendCRC2("$1E166C9400FFFF000000FF949D"));
        assertEquals("$1E166C94FFFF0000FFFFFFA7DFFB", CRCUtil.appendCRC2("$1E166C94FFFF0000FFFFFFA7DF"));
        assertEquals("$1E154498FF0000000000FF1187FF", CRCUtil.appendCRC2("$1E154498FF0000000000FF1187"));
        assertEquals("$1E161CC1FF00FF0000FFFF4EADC2", CRCUtil.appendCRC2("$1E161CC1FF00FF0000FFFF4EAD"));
        assertEquals("$1E156C9400FFFFFF00FFFF6D0EE0", CRCUtil.appendCRC2("$1E156C9400FFFFFF00FFFF6D0E"));
        assertEquals("$1E151CC10000FFFFFFFFFFDED354", CRCUtil.appendCRC2("$1E151CC10000FFFFFFFFFFDED3"));
        assertEquals("$1E15449800FFFFFF0000FFF1450B", CRCUtil.appendCRC2("$1E15449800FFFFFF0000FFF145"));
        assertEquals("$1E161CC1FFFFFFFFFFFFFF9ED20F", CRCUtil.appendCRC2("$1E161CC1FFFFFFFFFFFFFF9ED2"));
        assertEquals("$1E156C9400FF00FFFFFFFFF8C2ED", CRCUtil.appendCRC2("$1E156C9400FF00FFFFFFFFF8C2"));
        assertEquals("$1E161CC100FF0000FF00FF2950CF", CRCUtil.appendCRC2("$1E161CC100FF0000FF00FF2950"));
        assertEquals("$1E151CC1FF00FFFF00FFFFB4C18D", CRCUtil.appendCRC2("$1E151CC1FF00FFFF00FFFFB4C1"));
        assertEquals("$1E161CC100FFFF0000FFFFBF632C", CRCUtil.appendCRC2("$1E161CC100FFFF0000FFFFBF63"));
        assertEquals("$1E154498FFFFFFFF0000FF5434F5", CRCUtil.appendCRC2("$1E154498FFFFFFFF0000FF5434"));
        assertEquals("$1E156C9400FF00FF0000FF345E5A", CRCUtil.appendCRC2("$1E156C9400FF00FF0000FF345E"));
        assertEquals("$1E164498FFFFFFFFFF00FF2A9827", CRCUtil.appendCRC2("$1E164498FFFFFFFFFF00FF2A98"));
        assertEquals("$1E16449800FF000000FFFF527950", CRCUtil.appendCRC2("$1E16449800FF000000FFFF5279"));
        assertEquals("$1E164498FFFF00000000FFF4F7B4", CRCUtil.appendCRC2("$1E164498FFFF00000000FFF4F7"));
        assertEquals("$1E164498FF00FF00FFFFFF367B8B", CRCUtil.appendCRC2("$1E164498FF00FF00FFFFFF367B"));
        assertEquals("$1E15449800FF00FF0000FFABEA86", CRCUtil.appendCRC2("$1E15449800FF00FF0000FFABEA"));
        assertEquals("$1E151CC1FF00FFFFFF00FF785D91", CRCUtil.appendCRC2("$1E151CC1FF00FFFFFF00FF785D"));
        assertEquals("$1E156C94FFFF00FFFF00FF5E4CA7", CRCUtil.appendCRC2("$1E156C94FFFF00FFFF00FF5E4C"));
        assertEquals("$1E151CC100FFFFFFFF00FF899360", CRCUtil.appendCRC2("$1E151CC100FFFFFFFF00FF8993"));
        assertEquals("$1E161CC10000FF00FF00FF274007", CRCUtil.appendCRC2("$1E161CC10000FF00FF00FF2740"));
        assertEquals("$1E161CC1FFFFFFFFFF00FF9D2D09", CRCUtil.appendCRC2("$1E161CC1FFFFFFFFFF00FF9D2D"));
        assertEquals("$1E166C94FFFFFF00FFFFFFFD7084", CRCUtil.appendCRC2("$1E166C94FFFFFF00FFFFFFFD70"));
        assertEquals("$1E161CC1FFFF00FF00FFFF0B1E3F", CRCUtil.appendCRC2("$1E161CC1FFFF00FF00FFFF0B1E"));
        assertEquals("$1E161CC1FF00FF00FF00FF8231BA", CRCUtil.appendCRC2("$1E161CC1FF00FF00FF00FF8231"));
        assertEquals("$1E166C94FFFFFF00FF00FFFE8F2F", CRCUtil.appendCRC2("$1E166C94FFFFFF00FF00FFFE8F"));
        assertEquals("$1E154498FFFF00FFFFFFFFC20796", CRCUtil.appendCRC2("$1E154498FFFF00FFFFFFFFC207"));
        assertEquals("$1E16449800FFFFFF0000FF408A0A", CRCUtil.appendCRC2("$1E16449800FFFFFF0000FF408A"));
        assertEquals("$1E161CC1FFFF0000FF00FF8C212E", CRCUtil.appendCRC2("$1E161CC1FFFF0000FF00FF8C21"));
        assertEquals("$1E164498FFFFFF00FFFFFF62C481", CRCUtil.appendCRC2("$1E164498FFFFFF00FFFFFF62C4"));
        assertEquals("$1E15449800FF0000FFFFFF2CD5E6", CRCUtil.appendCRC2("$1E15449800FF0000FFFFFF2CD5"));
        assertEquals("$1E164498FF00FF0000FFFFF91866", CRCUtil.appendCRC2("$1E164498FF00FF0000FFFFF918"));
        assertEquals("$1E166C94FFFFFFFFFF00FFB52C1C", CRCUtil.appendCRC2("$1E166C94FFFFFFFFFF00FFB52C"));
        assertEquals("$1E161CC100FFFF000000FFBC9C2A", CRCUtil.appendCRC2("$1E161CC100FFFF000000FFBC9C"));
        assertEquals("$1E166C9400FFFF00FFFFFF580147", CRCUtil.appendCRC2("$1E166C9400FFFF00FFFFFF5801"));
        assertEquals("$1E166C94FF00FF00FF00FFAA3008", CRCUtil.appendCRC2("$1E166C94FF00FF00FF00FFAA30"));
        assertEquals("$1E161CC1FFFFFF0000FFFF1A127A", CRCUtil.appendCRC2("$1E161CC1FFFFFF0000FFFF1A12"));
        assertEquals("$1E156C94FFFFFF00FFFFFF4CBFE2", CRCUtil.appendCRC2("$1E156C94FFFFFF00FFFFFF4CBF"));
        assertEquals("$1E164498000000FF00FFFF4D6557", CRCUtil.appendCRC2("$1E164498000000FF00FFFF4D65"));
        assertEquals("$1E151CC100FF00FFFFFFFFD0C3E2", CRCUtil.appendCRC2("$1E151CC100FF00FFFFFFFFD0C3"));
        assertEquals("$1E1544980000FFFF0000FFA5FA2A", CRCUtil.appendCRC2("$1E1544980000FFFF0000FFA5FA"));
        assertEquals("$1E166C9400FF00FF0000FF859118", CRCUtil.appendCRC2("$1E166C9400FF00FF0000FF8591"));
        assertEquals("$1E166C94FF000000FF00FFF09F72", CRCUtil.appendCRC2("$1E166C94FF000000FF00FFF09F"));
        assertEquals("$1E156C9400FF00FFFF00FFFB3D95", CRCUtil.appendCRC2("$1E156C9400FF00FFFF00FFFB3D"));
        assertEquals("$1E161CC100FF00FF0000FFAD9002", CRCUtil.appendCRC2("$1E161CC100FF00FF0000FFAD90"));
        assertEquals("$1E156C94FF0000FFFF00FF0AF322", CRCUtil.appendCRC2("$1E156C94FF0000FFFF00FF0AF3"));
        assertEquals("$1E156C9400FF0000FF00FFB09EC1", CRCUtil.appendCRC2("$1E156C9400FF0000FF00FFB09E"));
        assertEquals("$1E154498FF00FF0000FFFF48D7D5", CRCUtil.appendCRC2("$1E154498FF00FF0000FFFF48D7"));
        assertEquals("$1E151CC1FF0000FF00FFFFEE6E1A", CRCUtil.appendCRC2("$1E151CC1FF0000FF00FFFFEE6E"));
        assertEquals("$1E161CC1FF00000000FFFF140227", CRCUtil.appendCRC2("$1E161CC1FF00000000FFFF1402"));
        assertEquals("$1E161CC100FFFFFFFF00FF385CED", CRCUtil.appendCRC2("$1E161CC100FFFFFFFF00FF385C"));
        assertEquals("$1E161CC1FFFF000000FFFF40BDC6", CRCUtil.appendCRC2("$1E161CC1FFFF000000FFFF40BD"));
        assertEquals("$1E151CC1FF00000000FFFFA5CDA0", CRCUtil.appendCRC2("$1E151CC1FF00000000FFFFA5CD"));
        assertEquals("$1E16449800FFFF00FFFFFFC7B529", CRCUtil.appendCRC2("$1E16449800FFFF00FFFFFFC7B5"));
        assertEquals("$1E154498FF00FFFF0000FF008BB9", CRCUtil.appendCRC2("$1E154498FF00FFFF0000FF008B"));
        assertEquals("$1E161CC1FFFFFF00FF00FFD68E1E", CRCUtil.appendCRC2("$1E161CC1FFFFFF00FF00FFD68E"));
        assertEquals("$1E151CC1FF000000FF00FF6951D7", CRCUtil.appendCRC2("$1E151CC1FF000000FF00FF6951"));
        assertEquals("$1E151CC100000000FF00FFCC20C8", CRCUtil.appendCRC2("$1E151CC100000000FF00FFCC20"));
        assertEquals("$1E16449800000000FFFFFFC9A5B8", CRCUtil.appendCRC2("$1E16449800000000FFFFFFC9A5"));
        assertEquals("$1E161CC1FF000000FFFFFFDB6143", CRCUtil.appendCRC2("$1E161CC1FF000000FFFFFFDB61"));
        assertEquals("$1E161CC1FFFFFF00FFFFFFD571B6", CRCUtil.appendCRC2("$1E161CC1FFFFFF00FFFFFFD571"));
        assertEquals("$1E164498FF0000FFFFFFFF2777CD", CRCUtil.appendCRC2("$1E164498FF0000FFFFFFFF2777"));
        assertEquals("$1E1544980000FFFFFFFFFF69661D", CRCUtil.appendCRC2("$1E1544980000FFFFFFFFFF6966"));
        assertEquals("$1E166C94FF00FFFFFF00FFE1935F", CRCUtil.appendCRC2("$1E166C94FF00FFFFFF00FFE193"));
        assertEquals("$1E154498FFFF0000FFFFFF89A45E", CRCUtil.appendCRC2("$1E154498FFFF0000FFFFFF89A4"));
        assertEquals("$1E166C94000000FF00FFFFD2D1B9", CRCUtil.appendCRC2("$1E166C94000000FF00FFFFD2D1"));
        assertEquals("$1E156C94FF000000FFFFFF42AF2F", CRCUtil.appendCRC2("$1E156C94FF000000FFFFFF42AF"));
        assertEquals("$1E161CC1FF000000FF00FFD89ED6", CRCUtil.appendCRC2("$1E161CC1FF000000FF00FFD89E"));
        assertEquals("$1E161CC1000000FF00FFFFFAD023", CRCUtil.appendCRC2("$1E161CC1000000FF00FFFFFAD0"));
        assertEquals("$1E161CC1FFFFFFFF00FFFF51B180", CRCUtil.appendCRC2("$1E161CC1FFFFFFFF00FFFF51B1"));
        assertEquals("$1E1544980000FFFF00FFFFA6052F", CRCUtil.appendCRC2("$1E1544980000FFFF00FFFFA605"));
        assertEquals("$1E154498FF00FF000000FF4B28F2", CRCUtil.appendCRC2("$1E154498FF00FF000000FF4B28"));
        assertEquals("$1E166C94FFFF000000FFFF68BCAD", CRCUtil.appendCRC2("$1E166C94FFFF000000FFFF68BC"));
        assertEquals("$1E164498FF00FFFF0000FFB14413", CRCUtil.appendCRC2("$1E164498FF00FFFF0000FFB144"));
        assertEquals("$1E151CC100FF000000FFFF54033F", CRCUtil.appendCRC2("$1E151CC100FF000000FFFF5403"));
        assertEquals("$1E154498FF000000FFFFFFDD1B98", CRCUtil.appendCRC2("$1E154498FF000000FFFFFFDD1B"));
        assertEquals("$1E1544980000FF0000FFFFEDA624", CRCUtil.appendCRC2("$1E1544980000FF0000FFFFEDA6"));
        assertEquals("$1E15449800FFFF00FF00FF758590", CRCUtil.appendCRC2("$1E15449800FFFF00FF00FF7585"));
        assertEquals("$1E164498FFFFFF00FF00FF613BC4", CRCUtil.appendCRC2("$1E164498FFFFFF00FF00FF613B"));
        assertEquals("$1E166C940000FF0000FFFFC3DD42", CRCUtil.appendCRC2("$1E166C940000FF0000FFFFC3DD"));
        assertEquals("$1E151CC10000FF0000FFFF5A1362", CRCUtil.appendCRC2("$1E151CC10000FF0000FFFF5A13"));
        assertEquals("$1E166C9400FF000000FFFFCDCD5C", CRCUtil.appendCRC2("$1E166C9400FF000000FFFFCDCD"));
        assertEquals("$1E164498FF00FF000000FFFAE7B0", CRCUtil.appendCRC2("$1E164498FF00FF000000FFFAE7"));
        assertEquals("$1E156C9400FFFF000000FF2552B7", CRCUtil.appendCRC2("$1E156C9400FFFF000000FF2552"));
        assertEquals("$1E151CC100FF00000000FF57FCF5", CRCUtil.appendCRC2("$1E151CC100FF00000000FF57FC"));
        assertEquals("$1E154498FFFF000000FFFF46C7F6", CRCUtil.appendCRC2("$1E154498FFFF000000FFFF46C7"));
        assertEquals("$1E164498FFFF00FF00FFFFBCAB70", CRCUtil.appendCRC2("$1E164498FFFF00FF00FFFFBCAB"));
        assertEquals("$1E161CC1FF00FFFF0000FF06F1CF", CRCUtil.appendCRC2("$1E161CC1FF00FFFF0000FF06F1"));
        assertEquals("$1E151CC1000000FFFF00FF8783A8", CRCUtil.appendCRC2("$1E151CC1000000FFFF00FF8783"));
        assertEquals("$1E1644980000FFFF00FFFF17CA03", CRCUtil.appendCRC2("$1E1644980000FFFF00FFFF17CA"));
        assertEquals("$1E166C94FFFF00FF00FFFF231FA6", CRCUtil.appendCRC2("$1E166C94FFFF00FF00FFFF231F"));
        assertEquals("$1E16449800FF00FFFF00FFD5467C", CRCUtil.appendCRC2("$1E16449800FF00FFFF00FFD546"));
        assertEquals("$1E166C9400000000FFFFFF56118F", CRCUtil.appendCRC2("$1E166C9400000000FFFFFF5611"));
        assertEquals("$1E15449800FF00FFFF00FF648962", CRCUtil.appendCRC2("$1E15449800FF00FFFF00FF6489"));

    }
}
