'use client'

import { useRouter } from "next/navigation"
import { DataGrid } from '@mui/x-data-grid';
import { useState, useEffect } from "react"
import {Box, Button, Input, Typography} from '@mui/material';
import { useSelector, useDispatch } from 'react-redux'
import { NextPage } from "next";
import { findAllBoards } from "@/app/component/board/service/board-service";
import BoardColumns from "@/app/component/board/module/boards-columns";
import { dir } from "console";
import { propsToClassKey } from "@mui/styles";
// import React from "react";


export default function BoardDetailPage (props:any)  {

    useEffect(() => {
        //dispatch(findBoardById(props.params.id))
    }, [])


    return (<>{props.params.id}번 게시판 상세
{/* <span>ID</span><Typography textAlign="center" sx={{fontSize:"1.5rem"}}>  {row.id}</Typography>
<span>게시판타입</span><Typography textAlign="center" sx={{fontSize:"1.5rem"}}>  {row.boardType}</Typography>
<span>등록일</span><Typography textAlign="center" sx={{fontSize:"1.5rem"}}>  {row.regDate}</Typography>
<span>수정일</span><Typography textAlign="center" sx={{fontSize:"1.5rem"}}>  {row.modDate}</Typography> */}

    </>)
}