package com.shengsiyuan.netty.secondexample;


import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;

public class MyServerOutHandlerX extends ChannelOutboundHandlerAdapter{

    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
//        ctx.write(msg, promise);
//        System.out.println("from OutHandler server: " + ctx.channel().remoteAddress() + ", " + msg);
//        ctx.channel().writeAndFlush(" ---> " + msg + " <--- ");
        System.out.println("write [[[ : " + msg);
        ctx.write(" [[[ " + msg + " ]]] ",promise);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
