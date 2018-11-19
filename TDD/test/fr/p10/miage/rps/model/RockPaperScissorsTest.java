package fr.p10.miage.rps.model;

import jdk.jfr.DataAmount;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class RockPaperScissorsTest {
    RockPaperScissors rps;

    @BeforeMethod
    public void setUp() throws Exception{
        rps = new RockPaperScissors();
    }

    @AfterMethod
    public void tearDown()throws Exception {
        rps = null;
    }

    @Test
    public void testPlay()throws Exception {
        assertEquals(rps.play(RPSEnum.ROCK,RPSEnum.SCISSORS),Result.WIN);
    }


    @Test
    public void testPlay2()throws Exception {
        assertEquals(rps.play(RPSEnum.ROCK,RPSEnum.PAPER),Result.LOST);
    }
/**
    @Parameters({"paper","rock"})
    @Test
    public void testWinPlay(String p1, String p2){
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)),Result.WIN);

    }
    @Parameters({"paper","paper"})
    @Test
    public void TestTiePlay(String p1,String p2)
    {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)),Result.TIE);
    }

    @Parameters({"rock","paper"})
    @Test
    public void TestLosePlay(String p1,String p2)
    {
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)),Result.LOST);
    }
**/

    @DataProvider( name = "winData")
    public Object[][] createWinData() {
        return new Object[][]{{RPSEnum.PAPER, RPSEnum.ROCK},{RPSEnum.ROCK, RPSEnum.SCISSORS},{RPSEnum.SCISSORS, RPSEnum.PAPER}};
    }

    @DataProvider( name = "tieData")
    public Object[][] createTieData() {
        return new Object[][]{{RPSEnum.PAPER, RPSEnum.PAPER},{RPSEnum.ROCK, RPSEnum.ROCK},{RPSEnum.SCISSORS, RPSEnum.SCISSORS}};
    }

    @DataProvider ( name = "loseData")
    public Object[][] createLoseData() {
        return new Object[][]{{RPSEnum.PAPER, RPSEnum.SCISSORS},{RPSEnum.ROCK, RPSEnum.PAPER},{RPSEnum.SCISSORS, RPSEnum.ROCK}};
    }


    @Test (dataProvider = "winData")
    void testWinPlay(RPSEnum p1,RPSEnum p2)
    {
        assertEquals(rps.play(p1,p2),Result.WIN);
    }

    @Test (dataProvider = "tieData")
    void testTiePlay(RPSEnum p1,RPSEnum p2)
    {
        assertEquals(rps.play(p1,p2),Result.TIE);
    }


    @Test (dataProvider = "loseData")
    void testLosePlay(RPSEnum p1,RPSEnum p2)
    {
        assertEquals(rps.play(p1,p2),Result.LOST);
    }







}