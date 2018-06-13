package com.eyenight.pro.eyenightpro.activity

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.eyenight.pro.eyenightpro.R
import com.eyenight.pro.eyenightpro.model.ENUser
import com.parse.ParseUser
import kotlinx.android.synthetic.main.event_list.view.*

class EventListActivity : Activity() {

    lateinit var eventRecyclerView: RecyclerView
    lateinit var linearLayoutManager: LinearLayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        eventRecyclerView = findViewById(R.id.event_list)
        linearLayoutManager = LinearLayoutManager(this)
        eventRecyclerView.layoutManager = linearLayoutManager
//        eventRecyclerView.adapter = EventListAdapter()
    }

    companion object {

        private val INTENT_USER_ID = "user_id"

        fun newIntent(context: Context, user: ParseUser): Intent {
            val intent = Intent(context, EventListActivity::class.java)
            intent.putExtra(INTENT_USER_ID, user.objectId)
            return intent
        }
    }
}