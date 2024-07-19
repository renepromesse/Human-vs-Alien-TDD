package com.renepromesse;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.renepromesse.HumanTest;
import com.renepromesse.SpeciesTest;
import com.renepromesse.SuperpowerTest;
import com.renepromesse.AlienTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        HumanTest.class,
        SpeciesTest.class,
        SuperpowerTest.class,
        AlienTest.class
})

public class TestSuite {

}
