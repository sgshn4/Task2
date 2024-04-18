package com.pereslavtsev_o_yu.task2.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.pereslavtsev_o_yu.task2.LaunchesFragment
import com.pereslavtsev_o_yu.task2.RocketsFragment
import com.pereslavtsev_o_yu.task2.UpcomingFragment

private const val NUM_TABS = 3

public class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return UpcomingFragment()
            1 -> return LaunchesFragment()
        }
        return RocketsFragment()
    }
}