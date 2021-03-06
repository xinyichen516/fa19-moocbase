package edu.berkeley.cs186.database.recovery;

public class DummyRecoveryManager implements RecoveryManager {
    @Override
    public void initialize() {}

    @Override
    public void commit(long transNum) {}

    @Override
    public void abort(long transNum) {
        throw new UnsupportedOperationException("hw5 must be implemented to use abort");
    }

    @Override
    public void end(long transNum) {}

    @Override
    public void pageFlushHook(long pageNum, long pageLSN) {}

    @Override
    public long logPageWrite(long transNum, long pageNum, short pageOffset, byte[] before,
                             byte[] after) {
        return 0;
    }

    @Override
    public long logAllocPart(long transNum, long partNum) {
        return 0;
    }

    @Override
    public long logFreePart(long transNum, long partNum) {
        return 0;
    }

    @Override
    public long logAllocPage(long transNum, long pageNum) {
        return 0;
    }

    @Override
    public long logFreePage(long transNum, long pageNum) {
        return 0;
    }

    @Override
    public long logDiskIO(long pageNum) {
        return 0;
    }

    @Override
    public void savepoint(long transNum, String name) {
        throw new UnsupportedOperationException("hw5 must be implemented to use savepoints");
    }

    @Override
    public void releaseSavepoint(long transNum, String name) {
        throw new UnsupportedOperationException("hw5 must be implemented to use savepoints");
    }

    @Override
    public void rollbackToSavepoint(long transNum, String name) {
        throw new UnsupportedOperationException("hw5 must be implemented to use savepoints");
    }

    @Override
    public void checkpoint() {
        throw new UnsupportedOperationException("hw5 must be implemented to use checkpoints");
    }

    @Override
    public void restart() {}

    @Override
    public void close() {}
}
