def one_loop(l: list) -> bool:
    i = 1
    for x in l:
        j = i
        while (j != len(l)):
            if (l[i] == l[j]):
                return(True)
            else:
                j += 1
        i += 1
    return(False)

if __name__ == "__main__":
    print(one_loop([1,2,3,4,1]))