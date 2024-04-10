'use client'

import { useRouter } from "next/navigation"
import { DataGrid } from '@mui/x-data-grid';
import { useState, useEffect } from "react"
import {Box, Button, Input} from '@mui/material';
import { useSelector, useDispatch } from 'react-redux'
import { NextPage } from "next";
import { findAllBoards } from "@/app/component/board/service/board-service";
import BoardColumns from "@/app/component/board/module/boards-columns";
import { getAllBoards } from "@/app/component/board/service/board-slice";
// import React from "react";


const BoardListPage: NextPage = ({data}:any) => {
    const dispatch = useDispatch()
 
   const allBoards: [] = useSelector(getAllBoards)

    if(allBoards !== undefined){
        console.log('allBoards is not undefined')
        
        console.log('length is '+ allBoards.length)
        for(let i=0; i< allBoards.length; i++){
            console.log(JSON.stringify(allBoards[i]))
        }
    }else{
        console.log('allBoards is undefined')
    }
    

    useEffect(() => {
        dispatch(findAllBoards(1))
    }, [])
    
    return (<>
        <h2>게시판 목록</h2>
        <Box sx={{ height: 400 , width: '100%' }}>
     {allBoards && <DataGrid
        rows={allBoards}
        columns={BoardColumns()}
        initialState={{
          pagination: {
            paginationModel: {
              pageSize: 5,
            },
          },
        }}
        pageSizeOptions={[5]}
        checkboxSelection
        disableRowSelectionOnClick
      />}
    </Box>
    </>)
}

export default BoardListPage