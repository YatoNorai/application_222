package com.example.application_222

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment

class NotificationsFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_notifications, container, false)
}
