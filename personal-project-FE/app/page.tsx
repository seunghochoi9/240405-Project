'use client';
import { useState } from "react";
import axios from 'axios';
import Link from "next/link";
import { Button, Input } from "@mui/material";
import { API } from "./component/common/enums/API";
import { PG } from "./component/common/enums/PG";
import AxiosConfig from "./component/common/configs/axios-config";

export default function Home() {

  return (<div className='text-center'>
    <div>Welcome To React !!</div><br />
    {/* <h3 className='text-red-500'>당신의 이름은</h3><br />
    <input type="text" onChange={handleChange} /><br />
    <button onClick={handleClick}>전송</button><br /><br />
    <Link href={`${PG.USER}/login`} >로그인</Link><br /><br />
    <Link href={`${PG.USER}/join`}>회원가입</Link><br /><br />
    <Link href={`${PG.USER}/find`}>users</Link><br /><br />
    <Link href={`${PG.DEMO}/mui-demo`}>demo</Link><br /><br />
    <Link href={`${PG.DEMO}/companies`}>company</Link><br /><br />
    <Link href={`${PG.DEMO}/counter`}>demo-counter</Link><br /><br />  
    <Link href={`${PG.DEMO}/redux-counter`}>redux-counter</Link><br /><br />  
    <Link href={`${PG.BOARD}/articles`}>articles</Link><br /><br />   */}
  </div>
  );
}