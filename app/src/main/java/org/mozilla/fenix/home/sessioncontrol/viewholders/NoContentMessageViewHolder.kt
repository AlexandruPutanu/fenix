/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.fenix.home.sessioncontrol.viewholders

import android.view.View
import androidx.annotation.StringRes
import kotlinx.android.synthetic.main.no_content_message.*
import org.mozilla.fenix.R
import org.mozilla.fenix.ext.ViewHolder

open class NoContentMessageViewHolder(view: View) : ViewHolder(view) {

    fun bind(
        @StringRes header: Int,
        @StringRes description: Int
    ) {
        with(itemView.context) {
            no_content_header.text = getString(header)
            no_content_description.text = getString(description)
        }
    }

    companion object {
        const val LAYOUT_ID = R.layout.no_content_message
    }
}
