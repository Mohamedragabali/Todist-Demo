package com.example.todistdemo.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.todistdemo.R
import com.example.todistdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val objTodayFragment = TodayFragment()
    private val objUpcomingFragment = UpcomingFragment()
    private val objSearchFragment =SearchFragment()
    private val  objBrowseFragment = BrowseFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
        bottomNavigation()

    }

    private fun bottomNavigation() {
        binding.bottomNavigationbar.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.today_icon -> {
                    replaceFragment(objTodayFragment)
                    true
                }

                R.id.upcoming_icon -> {
                    replaceFragment(objUpcomingFragment)
                    true
                }
                R.id.search_icon-> {
                    replaceFragment(objSearchFragment)
                    true
                }
                R.id.browse_icon-> {
                replaceFragment(objBrowseFragment)
                true
                }

                else -> false
            }
        }
    }
    private fun initView() {
        addFragment(objTodayFragment)
    }

    private fun addFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_container, fragment)
        transaction.commit()
    }

    private fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.commit()
    }




}
