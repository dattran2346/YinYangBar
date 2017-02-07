/*
 * Copyright 2013, Edmodo, Inc. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this work except in compliance with the License.
 * You may obtain a copy of the License in the LICENSE file, or at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" 
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language 
 * governing permissions and limitations under the License. 
 */

package com.codee.yinyangbar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.TypedValue;

/**
 * Class representing the blue connecting line between the two thumbs.
 */
public class ConnectingLine {

    // Member Variables ////////////////////////////////////////////////////////

    private final Paint mPaint;

    private final float mY;

    // Constructor /////////////////////////////////////////////////////////////

    /**
     * Constructor for connecting line
     *
     * @param ctx                  the context for the line
     * @param y                    the y co-ordinate for the line
     * @param connectingLineWeight the weight of the line
     * @param connectingLineColor  the color of the line
     */
    public ConnectingLine(Context ctx, float y, float connectingLineWeight,
            int connectingLineColor) {

        final Resources res = ctx.getResources();

        float connectingLineWeight1 = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                connectingLineWeight,
                res.getDisplayMetrics());

        // Initialize the paint, set values
        mPaint = new Paint();
        mPaint.setColor(connectingLineColor);
        mPaint.setStrokeWidth(connectingLineWeight1);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        mPaint.setAntiAlias(true);

        mY = y;
    }

    // Package-Private Methods /////////////////////////////////////////////////


    /**
     * Draw the connecting line between for single slider.
     *
     * @param canvas the Canvas to draw to
     * @param thumb the thumb
     * @param leftMargin the left margin
     */
    public void draw(Canvas canvas, float leftMargin, PinView thumb) {
        canvas.drawLine(leftMargin, mY, thumb.getX(), mY, mPaint);
    }
}
