package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void returnsSquareOfNumber(){
        assertThat(queryProcessor.findSquare(4), is(16));
    }

    @Test
    public void returnsWhatIsMyName(){
        assertThat(queryProcessor.process("name"), is("Chanel and Daniella"));
    }

    @Test
    public void returnsLargestNumber(){
        assertThat(queryProcessor.process("Which of the following numbers is the largest: 33, 89, 79?"),is("89"));
    }

    @Test
    public void returnsMinusOfNumbers(){
        assertThat(queryProcessor.process("What is 87 minus 85?"), is("2"));
    }
@Test
    public void returnsMultiplicationNumber(){
        assertThat(queryProcessor.process("What is 6 multiplied by 27"), is("162"));
}
}
