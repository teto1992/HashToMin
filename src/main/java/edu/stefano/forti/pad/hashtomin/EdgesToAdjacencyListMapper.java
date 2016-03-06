/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.stefano.forti.pad.hashtomin;

import java.io.IOException;
import java.util.TreeSet;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
        
    
/**
 *
 * @author stefano
 */
public class EdgesToAdjacencyListMapper extends Mapper<LongWritable,Text,IntWritable,IntWritable> {
    @Override
    public void map(LongWritable key, Text couple, Mapper.Context context)
        throws IOException, InterruptedException{
        
        String[] verteces = couple.toString().split("[\\s\\t]+");
        
        context.write(new IntWritable(Integer.parseInt(verteces[0])), new IntWritable(Integer.parseInt(verteces[1])));
       
    }
}
