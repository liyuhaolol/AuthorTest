package com.example.authortest

import android.view.View
import com.chad.library.adapter.base.viewholder.BaseViewHolder

open class NBViewHolder(view: View) : BaseViewHolder(view){

    //返回item当前位置，未去除header
    open fun getItemPosition():Int{
        return layoutPosition
    }

    //返回item当前type
    open fun getItemType():Int{
        return itemViewType
    }
    //返回itemView
    open fun getItemView():View{
        return itemView
    }

}