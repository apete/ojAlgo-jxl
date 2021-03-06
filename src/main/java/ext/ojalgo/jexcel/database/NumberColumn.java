/*
 * Copyright 1997-2020 Optimatika
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package ext.ojalgo.jexcel.database;

import org.ojalgo.type.context.TypeContext;

import ext.ojalgo.jexcel.Spreadsheet;

public final class NumberColumn extends Column<Comparable<?>> {

    public NumberColumn(final String aName, final TypeContext<Comparable<?>> aContext) {
        super(aName, aContext);
    }

    @Override
    public Comparable<?> getCellValue(final Spreadsheet aSheet) {
        return aSheet.getNumberCellValue();
    }

    @Override
    public void setCellValue(final Spreadsheet aSheet, final Comparable<?> aCellValue) {
        aSheet.setNumberCellValue(aCellValue);
    }

}
