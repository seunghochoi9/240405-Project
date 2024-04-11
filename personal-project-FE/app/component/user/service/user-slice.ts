import { createSlice } from "@reduxjs/toolkit";
import { findAllUsers, findUserById } from "./user-service";
import { initialState } from "./user-init";

const userThunks = [findAllUsers, findUserById]

const status = {
    pending: 'pending',
    fulfilled: 'fulfilled',
    rejected: 'rejected'
}

// const handleFulfilled = (state:any, {payload}:any)=>{
//     console.log('-------------')
//     state.array= payload
//     console.log(state.array)
// }

const handlePending = (state: any) => {}
const handleRejected = (state: any) => {}

export const userSlice = createSlice({
    name: "users",
    initialState,
    reducers: {},
    extraReducers:builder => {
        const {pending, rejected} = status;
        builder
        .addCase(findAllUsers.fulfilled, (state:any, {payload}:any)=>{state.array= payload})
        .addCase(findUserById.fulfilled, (state:any, {payload}:any)=>{state.json= payload})
    }

})
export const getAllUsers = (state: any) => state.user.array
export const getUserById = (state: any) => state.user.json


export const {} = userSlice.actions

export default userSlice.reducer