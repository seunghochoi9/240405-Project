import { createSlice } from "@reduxjs/toolkit";
import { findAllUsers } from "./user-service";
import { initialState } from "./user-init";

const userThunks = [findAllUsers]

const status = {
    pending: 'pending',
    fulfilled: 'fulfilled',
    rejected: 'rejected'
}

const handleFulfilled = (state:any, {payload}:any)=>{
    console.log('-------------')
    state.array= payload
    console.log(state.array)
}

const handlePending = (state: any) => {
}

const handleRejected = (state: any) => {
}


export const userSlice = createSlice({
    name: "users",
    initialState,
    reducers: {},
    extraReducers:builder => {
        const {pending, rejected} = status;
        builder
        .addCase(findAllUsers.fulfilled, handleFulfilled)
    }

})
export const getAllUsers = (state: any) => {
    console.log('------------------ Before useSelector ---------------')
    console.log(JSON.stringify(state.user.array))
    return state.user.array;
}


export const {} = userSlice.actions

export default userSlice.reducer