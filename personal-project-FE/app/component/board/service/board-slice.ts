import { createSlice } from "@reduxjs/toolkit";
import { initialState } from './board-init';
import { findAllBoards } from './board-service';

const boardThunks = [findAllBoards]

const status = {
    pending: 'pending',
    fulfilled: 'fulfilled',
    rejected: 'rejected'
}

const handlePending = (state: any) => {
}

const handleRejected = (state: any) => {
}

export const boardSlice = createSlice({
    name: "board",
    initialState,
    reducers: {},
    extraReducers: builder => {
        const {pending, rejected} = status;
        builder
        .addCase(findAllBoards.fulfilled, (state: any, {payload}: any)=> {state.array})
    }
})

export const getAllBoards = (state: any) => {
    console.log('------------------ Before useSelector ---------------')
    console.log(JSON.stringify(state.board.array))
    return state.board.array;
}

export const getBoardById = (state: any) => {
    console.log('------------------ Before useSelector ---------------')
    console.log(JSON.stringify(state.board.array))
    return state.board.array;
}


export const {} = boardSlice.actions

export default boardSlice.reducer;